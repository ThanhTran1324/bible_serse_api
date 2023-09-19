package com.thanhdev.bb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thanhdev.bb.io.entity.VerseEntity;
import com.thanhdev.bb.services.VerseService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class VerseController {

    @Autowired
    VerseService verseService;

    @GetMapping(value="verse")
    public String test(){
        return "hello 2";
    }

    @PostMapping(value="add-verse")
    public String postMethodName() {
        //TODO: process POST request
        VerseEntity newVerse = new VerseEntity();
        newVerse.setName("test name 1");
        newVerse.setChapter_number(1);
        newVerse.setVerse_number(2);
        newVerse.setVerse_text("Ta on chua");
       
        
        return verseService.addNewVerse(newVerse).toString();
    }
    
}
