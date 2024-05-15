package com.example.libraryapp.controllers;

import com.example.libraryapp.model.entities.Author;
import com.example.libraryapp.model.repositories.AuthorRepository;
import com.example.libraryapp.model.repositories.BookRepository;
import com.example.libraryapp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LibraryController {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(AuthorRepository authorRepository, BookRepository bookRepository, LibraryService libraryService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.libraryService = libraryService;
    }


    @GetMapping("/author/book")
    public Optional<Author> getAuthorByBookTitle( @RequestParam("title") String title) {
        return libraryService.findAuthorByBookTitle(title);
    }

//    @GetMapping("/authors")
//    public List<Author> getAuthors() {
//        return authorRepository.findAll();
//    }
//
//    @GetMapping("/authors/get/name")
//    public List<Author> getAllAuthorsByName(@RequestParam String name) {
//        return authorRepository.findAll().stream()
//                .filter(author -> author.getFullName().toLowerCase().contains(name))
//                .toList();
//    }
//
//    @PostMapping("/author/post")
//    public String addAuthor(@RequestBody Author author) {
//        authorRepository.save(author);
//        return "Author added successfully: " + author.getFullName();
//    }
//
//    @PutMapping("/author/patch/{id}")
//    public Author updateAuthor(@PathVariable Integer id, @RequestBody Author author) {
//        Author authorToUpdate = authorRepository.findById(id).get();
//        authorToUpdate.setFullName(author.getFullName());
//        return authorRepository.save(author);
//
//    }

}
