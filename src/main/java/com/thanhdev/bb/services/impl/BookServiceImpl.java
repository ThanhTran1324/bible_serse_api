package com.thanhdev.bb.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhdev.bb.io.entity.BookEntity;
import com.thanhdev.bb.io.to.BookTO;
import com.thanhdev.bb.repo.BookRepo;
import com.thanhdev.bb.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<BookTO> getAllBooks(){
        List<BookTO> returnValue = new ArrayList<BookTO>();
        List<BookEntity> bookEntities = bookRepo.findAll();

        for(BookEntity bookEntity: bookEntities){
            BookTO newBookTO = new BookTO();
                    BeanUtils.copyProperties(bookEntity, newBookTO);
            returnValue.add(newBookTO);
        }
        return returnValue;
    }
}
