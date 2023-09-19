package com.thanhdev.bb.io.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "verse")
public class VerseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    private String name;

    @Column(nullable =  false)
    private int chapter_number;

    @Column(nullable = false)
    private int verse_number;

    @Column(nullable = false)
    private String verse_text;

    @Column(nullable = true, columnDefinition = "TIMESTAMP")
    private Timestamp create_at ;

    @Column(nullable = true, columnDefinition = "TIMESTAMP")
    private Timestamp update_at ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(int chapter_number) {
        this.chapter_number = chapter_number;
    }

    public int getVerse_number() {
        return verse_number;
    }

    public void setVerse_number(int verse_number) {
        this.verse_number = verse_number;
    }

    public String getVerse_text() {
        return verse_text;
    }

    public void setVerse_text(String verse_text) {
        this.verse_text = verse_text;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    
}
