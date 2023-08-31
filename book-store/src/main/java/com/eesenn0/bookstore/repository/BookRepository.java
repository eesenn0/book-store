package com.eesenn0.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eesenn0.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
