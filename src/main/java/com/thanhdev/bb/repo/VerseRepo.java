package com.thanhdev.bb.repo;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhdev.bb.io.entity.VerseEntity;

public interface VerseRepo extends JpaRepository<VerseEntity, Long> {
    ArrayList<VerseEntity> findAll();
    ArrayList<VerseEntity> findByBookId(Long bookId);
    ArrayList<VerseEntity> findByBookIdAndChapterNumber(Long bookId, Long chapterNumber);
    ArrayList<VerseEntity> findByBookIdAndChapterNumberAndVerseNumber(Long bookId, Long chapterNumber,
            Long verseNumber);
   
}
