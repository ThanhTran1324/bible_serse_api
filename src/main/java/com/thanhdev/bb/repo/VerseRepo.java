package com.thanhdev.bb.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhdev.bb.io.entity.VerseEntity;
import org.springframework.data.domain.Sort;


public interface VerseRepo extends JpaRepository<VerseEntity, Long> {
 
    ArrayList<VerseEntity> findAll(Sort sort);
    ArrayList<VerseEntity> findByBookId(Long bookId, Sort sort);
    ArrayList<VerseEntity> findByBookIdAndChapterNumber(Long bookId, Long chapterNumber, Sort sort);
    ArrayList<VerseEntity> findByBookIdAndChapterNumberAndVerseNumber(Long bookId, Long chapterNumber,
            Long verseNumber, Sort sort);
   
}
