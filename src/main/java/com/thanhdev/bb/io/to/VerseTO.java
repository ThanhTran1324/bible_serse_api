package com.thanhdev.bb.io.to;

public class VerseTO {
    private Long id;
    private Long book_id;
    private Long chapter_number;
    private Long verse_number;
    private String verse_content;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getBook_id() {
        return book_id;
    }
    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }
    public Long getChapter_number() {
        return chapter_number;
    }
    public void setChapter_number(Long chapter_number) {
        this.chapter_number = chapter_number;
    }
    public Long getVerse_number() {
        return verse_number;
    }
    public void setVerse_number(Long verse_number) {
        this.verse_number = verse_number;
    }
    public String getVerse_content() {
        return verse_content;
    }
    public void setVerse_content(String verse_content) {
        this.verse_content = verse_content;
    }

    
}
