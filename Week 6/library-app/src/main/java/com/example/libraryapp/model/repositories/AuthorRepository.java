package com.example.libraryapp.model.repositories;

import com.example.libraryapp.model.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findAuthorByFullName(String fullName);
    Optional<Author> findAuthorById(int id);


}