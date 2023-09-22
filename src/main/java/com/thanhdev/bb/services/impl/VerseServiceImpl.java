package com.thanhdev.bb.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.thanhdev.bb.io.entity.VerseEntity;
import com.thanhdev.bb.io.to.VerseTO;
import com.thanhdev.bb.repo.VerseRepo;
import com.thanhdev.bb.services.VerseService;


@Service
public class VerseServiceImpl implements VerseService{

    @Autowired
    VerseRepo verseRepo;

    @Override
    public List<VerseTO> getVerses(Long bookId, Long chapterNumber, Long verseNumber){
        List<VerseTO> returnVerseTO = new ArrayList<VerseTO>();
        ArrayList<VerseEntity> verseQueryResult = new ArrayList<VerseEntity>();
    Sort sortByBookChapterVerse = Sort.by(
        Sort.Order.asc("bookId"),
        Sort.Order.asc("chapterNumber"),
        Sort.Order.asc("verseNumber")
);
        if(bookId == null && chapterNumber == null && verseNumber == null){
            verseQueryResult = verseRepo.findAll(sortByBookChapterVerse);
        }

        if(bookId != null && chapterNumber == null && verseNumber == null){
            verseQueryResult = verseRepo.findByBookId(bookId, sortByBookChapterVerse);
        }

        if(bookId != null && chapterNumber != null && verseNumber == null){
            verseQueryResult = verseRepo.findByBookIdAndChapterNumber(bookId, chapterNumber, sortByBookChapterVerse);
        }

        if(bookId != null && chapterNumber != null && verseNumber != null){
            verseQueryResult = verseRepo.findByBookIdAndChapterNumberAndVerseNumber(bookId, chapterNumber, verseNumber, sortByBookChapterVerse);
        }

        

        for(VerseEntity verseEntity: verseQueryResult){
            VerseTO newVerseTO = new VerseTO();
            BeanUtils.copyProperties(verseEntity, newVerseTO);    
            returnVerseTO.add(newVerseTO);
        }

       return returnVerseTO;
    }

    
}
