package com.thanhdev.bb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thanhdev.bb.io.to.VerseTO;
import com.thanhdev.bb.services.VerseService;


@RestController
public class VerseController {

    @Autowired
    VerseService verseService;

    @GetMapping(value="verses")
    public List<VerseTO> getVerses(@RequestParam(required = false) Long bookId, @RequestParam(required = false) Long chapterNumber, @RequestParam(required = false) Long verseNumber) {
        
        return verseService.getVerses(bookId, chapterNumber, verseNumber);
    }
    
}
