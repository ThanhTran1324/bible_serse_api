package com.thanhdev.bb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thanhdev.bb.exceptions.RequestInvalidException;
import com.thanhdev.bb.io.to.VerseTO;
import com.thanhdev.bb.services.VerseService;


@RestController
public class VerseController {

    @Autowired
    VerseService verseService;

    @GetMapping(value="verses")
    public List<VerseTO> getVerses(Long bookId, @RequestParam(required = false) Long chapterNumber, @RequestParam(required = false) Long verseStartNumber, @RequestParam(required = false) Long verseEndNumber) throws RequestInvalidException {
        if(bookId == null) throw new RequestInvalidException("Required bookId is missing");
        return verseService.getVerses(bookId, chapterNumber, verseStartNumber, verseEndNumber);
    }
    
}
