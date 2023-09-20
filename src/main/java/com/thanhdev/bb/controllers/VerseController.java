package com.thanhdev.bb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thanhdev.bb.io.to.VerseTO;
import com.thanhdev.bb.services.VerseService;


@RestController
public class VerseController {

    @Autowired
    VerseService verseService;

    @GetMapping(value="verse")
    public VerseTO postMethodName() {
      
        return verseService.getVerse();
    }
    
}
