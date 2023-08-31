package com.eesenn0.bookstore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eesenn0.bookstore.model.Book;
import com.eesenn0.bookstore.repository.BookRepository;

@Service
public class BookService {
    
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId) {
        return bookRepository.findById(bookId);
    }
}
