package com.thanhdev.bb.io.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bible_chapters")
public class ChapterEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="book_id", nullable = false)
    private Long bookId;

    @Column(name="chapter_number", nullable = false)
    private Long chapterNumber;

    @Column(name="max_verse_number", nullable = false)
    private Long maxVerseNumber;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Long chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public Long getMaxVerseNumber() {
        return maxVerseNumber;
    }

    public void setMaxVerseNumber(Long maxVerseNumber) {
        this.maxVerseNumber = maxVerseNumber;
    }
}
