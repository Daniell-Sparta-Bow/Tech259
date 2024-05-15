package com.example.libraryapp.model.repositories;

import com.example.libraryapp.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findBooksByAuthorId_fullName(String author);
    Optional<Book> findBookByTitle(String title);

}