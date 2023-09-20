package com.thanhdev.bb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhdev.bb.io.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Long> {
}
