package com.example.libraryapp.controllers;

import com.example.libraryapp.model.entities.Author;
import com.example.libraryapp.model.entities.Book;
import com.example.libraryapp.model.exceptions.AuthorNotFoundException;
import com.example.libraryapp.model.repositories.AuthorRepository;
import com.example.libraryapp.model.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return bookRepository.findById(id).get();
    }

//    @PostMapping("/book")
//    public Book addBook(@RequestBody Book book) {
//        return bookRepository.save(book);
//    }

    @PostMapping("/book")
    public String addBook(@RequestBody Book book) throws AuthorNotFoundException {
        Optional<Author> author = authorRepository.findAuthorByFullName(book.getAuthor().getFullName());
        if (author.isEmpty()) {
            throw new AuthorNotFoundException(book.getAuthor().getFullName());
        } else {
            book.setAuthor(author.get());
            bookRepository.save(book);
            return "book has been saved";
        }
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        Book bookToUpdate = bookRepository.findById(id).orElse(null);

        if (bookToUpdate != null) {
            throw new ResponseStatusException(NOT_FOUND, "Book not found");
        }

        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setTitle(book.getTitle());

        return bookRepository.save(bookToUpdate);
    }


    @DeleteMapping("/book/{id}")
    public Book deleteBook(@PathVariable Integer id) {
        Book bookToDelete = bookRepository.findById(id).orElse(null);
        if (bookToDelete == null) {
            throw new ResponseStatusException(NOT_FOUND, "Book not found");
        }
        bookRepository.delete(bookToDelete);
        return bookToDelete;
    }
}
