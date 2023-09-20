package com.thanhdev.bb.services.impl;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    public VerseTO getVerse(){
       VerseTO returnVerseTO = new VerseTO();
       VerseEntity verseEntity = verseRepo.getById(Long.parseLong("5000"));
       BeanUtils.copyProperties(verseEntity, returnVerseTO);
        
       return returnVerseTO;
    }

    
}
