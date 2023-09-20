package com.thanhdev.bb.services;

import java.util.List;

import com.thanhdev.bb.io.to.BookTO;

public interface BookService {
    List<BookTO> getAllBooks();
}
