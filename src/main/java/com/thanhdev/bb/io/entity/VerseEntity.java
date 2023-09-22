package com.thanhdev.bb.io.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "bible_verses")
public class VerseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "chapter_number", nullable =  false)
    private Long chapterNumber;

    @Column(name = "verse_number",nullable = false)
    private Long verseNumber;

    @Column(name = "verse_content", columnDefinition = "VARCHAR(255)")
    private String verseContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Long verseNumber) {
        this.verseNumber = verseNumber;
    }

    public String getVerseContent() {
        return verseContent;
    }

    public void setVerseContent(String verseContent) {
        this.verseContent = verseContent;
    }




    
}
