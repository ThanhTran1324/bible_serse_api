package com.thanhdev.bb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.thanhdev.bb.io.to.BookTO;
import com.thanhdev.bb.services.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    
    @Autowired
    BookService bookService;

    @GetMapping(value="books")
    public List<BookTO> getAllBooks() {
        return bookService.getAllBooks();
    }
    
}
