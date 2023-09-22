package com.thanhdev.bb.services.impl;

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
    public List<VerseTO> getVerses(Long bookId, Long chapterNumber, Long verseNumber){
        List<VerseTO> returnVerseTO = new ArrayList<VerseTO>();
        ArrayList<VerseEntity> verseQueryResult = new ArrayList<VerseEntity>();

        if(bookId == null && chapterNumber == null && verseNumber == null){
            verseQueryResult = verseRepo.findAll();
        }

        if(bookId != null && chapterNumber == null && verseNumber == null){
            verseQueryResult = verseRepo.findByBookId(bookId);
        }

        if(bookId != null && chapterNumber != null && verseNumber == null){
            verseQueryResult = verseRepo.findByBookIdAndChapterNumber(bookId, chapterNumber);
        }

        if(bookId != null && chapterNumber != null && verseNumber != null){
            verseQueryResult = verseRepo.findByBookIdAndChapterNumberAndVerseNumber(bookId, chapterNumber, verseNumber);
        }

        

        for(VerseEntity verseEntity: verseQueryResult){
            VerseTO newVerseTO = new VerseTO();
            BeanUtils.copyProperties(verseEntity, newVerseTO);    
            returnVerseTO.add(newVerseTO);
        }

       return returnVerseTO;
    }

    
}
