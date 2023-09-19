package com.thanhdev.bb.services;

import java.util.List;

import com.thanhdev.bb.io.entity.VerseEntity;

public interface VerseService {
    List<String> getRandomVerse();
    VerseEntity addNewVerse(VerseEntity newVerseEntity);
}
