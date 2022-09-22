package com.kgisl.sb4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.sb4.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
