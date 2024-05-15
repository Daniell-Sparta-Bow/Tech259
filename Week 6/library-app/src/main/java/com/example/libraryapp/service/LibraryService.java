package com.example.libraryapp.service;

import com.example.libraryapp.model.entities.Author;
import com.example.libraryapp.model.entities.Book;
import com.example.libraryapp.model.repositories.AuthorRepository;
import com.example.libraryapp.model.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public LibraryService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Optional<Author> findAuthorByBookTitle(String title) {
        Optional<Book> book = bookRepository.findBookByTitle(title);
        Author author = null;
        if (book.isPresent()) {
            author = book.get().getAuthor();
        }
        return Optional.ofNullable(author);
    }


}
