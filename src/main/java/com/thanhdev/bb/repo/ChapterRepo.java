package com.thanhdev.bb.repo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhdev.bb.io.entity.ChapterEntity;

import java.util.ArrayList;

public interface ChapterRepo extends JpaRepository<ChapterEntity, Long> {
    ArrayList<ChapterEntity> findByBookId(Long bookId, Sort sort);
}
