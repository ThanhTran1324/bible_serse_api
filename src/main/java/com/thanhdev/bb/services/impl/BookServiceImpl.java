package com.thanhdev.bb.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.thanhdev.bb.io.entity.BookEntity;
import com.thanhdev.bb.io.entity.ChapterEntity;
import com.thanhdev.bb.io.to.BookTO;
import com.thanhdev.bb.io.to.ChapterTO;
import com.thanhdev.bb.repo.BookRepo;
import com.thanhdev.bb.repo.ChapterRepo;
import com.thanhdev.bb.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    ChapterRepo chapterRepo;

    @Override
    public List<BookTO> getAllBooks(){
        Sort sortByBookId = Sort.by(Sort.Order.asc("bookId"));
        Sort sortByChapter = Sort.by(Sort.Order.asc("chapterNumber"));
        List<BookTO> returnValue = new ArrayList<BookTO>();
        List<BookEntity> bookEntities = bookRepo.findAll(sortByBookId);
        
        for(BookEntity bookEntity: bookEntities){
            BookTO newBookTO = new BookTO();
            BeanUtils.copyProperties(bookEntity, newBookTO);

            // Get ChapterTO for this book
            ArrayList<ChapterTO> chapterTOs = new ArrayList<ChapterTO>();
            List<ChapterEntity> chapterEntities = chapterRepo.findByBookId(bookEntity.getBookId(), sortByChapter);

            for(ChapterEntity chapterEntity: chapterEntities) {
            ChapterTO newChapterTO = new ChapterTO();
            BeanUtils.copyProperties(chapterEntity, newChapterTO);
            chapterTOs.add(newChapterTO);
            }

            newBookTO.setChapterDetailsTOs(chapterTOs);
            returnValue.add(newBookTO);
        }
        return returnValue;
    }
}
