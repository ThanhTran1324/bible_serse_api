package com.thanhdev.bb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhdev.bb.io.entity.VerseEntity;

public interface VerseRepo extends JpaRepository<VerseEntity, Long> {
    
}
