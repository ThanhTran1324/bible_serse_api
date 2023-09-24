package com.thanhdev.bb.io.to;

import java.util.ArrayList;

public class BookTO {
    private Long bookId;
    private String bookName;
    private Long maxChapterNumber;
    private ArrayList<ChapterTO> chapterDetailsTOs;
    
    public ArrayList<ChapterTO> getChapterDetailsTOs() {
        return chapterDetailsTOs;
    }
    public void setChapterDetailsTOs(ArrayList<ChapterTO> chapterDetailsTOs) {
        this.chapterDetailsTOs = chapterDetailsTOs;
    }
    public Long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
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
