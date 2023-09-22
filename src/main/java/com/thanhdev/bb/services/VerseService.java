package com.thanhdev.bb.services;

import java.util.List;

import com.thanhdev.bb.io.to.VerseTO;

public interface VerseService {
    List<VerseTO> getVerses(Long bookId, Long chapterNumber, Long verseNumber);

}
