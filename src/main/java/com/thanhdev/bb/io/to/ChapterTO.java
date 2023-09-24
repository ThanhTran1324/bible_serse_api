package com.thanhdev.bb.io.to;

public class ChapterTO {

    private Long bookId;
    private Long chapterNumber;
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
