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

    @Column(nullable = false)
    private long bookId;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String book_name;

    public long getbookId() {
        return bookId;
    }

    public void setbookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    
}
