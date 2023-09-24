package com.thanhdev.bb.io.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bible_books")
public class BookEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="book_id", nullable = false)
    private Long bookId;

    @Column(name="book_name", nullable = false, columnDefinition = "VARCHAR(255)")
    private String bookName;

    @Column(name="max_chapter_number", nullable = false)
    private Long maxChapterNumber;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getMaxChapterNumber() {
        return maxChapterNumber;
    }

    public void setMaxChapterNumber(Long maxChapterNumber) {
        this.maxChapterNumber = maxChapterNumber;
    }    
}
