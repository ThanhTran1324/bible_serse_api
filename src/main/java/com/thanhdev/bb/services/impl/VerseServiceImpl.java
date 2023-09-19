package com.thanhdev.bb.services.impl;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thanhdev.bb.io.entity.VerseEntity;
import com.thanhdev.bb.repo.VerseRepo;
import com.thanhdev.bb.services.VerseService;

@Service
public class VerseServiceImpl implements VerseService{

    @Autowired
    VerseRepo verseRepo;

    @Override
    public List<String> getRandomVerse(){
        // TODO hook the Repo
        ArrayList<String> returnValue = new ArrayList<>();

        return returnValue;
    }

    @Override
    public VerseEntity addNewVerse(VerseEntity newVerseEntity){
        if(newVerseEntity.getCreate_at() == null)
        newVerseEntity.setCreate_at(new Timestamp(System.currentTimeMillis()));

        return verseRepo.save(newVerseEntity);
    }

    
}
