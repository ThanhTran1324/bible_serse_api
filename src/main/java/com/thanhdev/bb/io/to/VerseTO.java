package com.thanhdev.bb.io.to;

public class VerseTO {
    private Long id;
    private Long bookId;
    private Long chapterNumber;
    private Long verseNumber;
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
