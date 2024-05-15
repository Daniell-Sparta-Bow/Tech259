package com.example.libraryapp.controllers;

import com.example.libraryapp.model.entities.Author;
import com.example.libraryapp.model.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    private boolean authorExists(int authorId) {
        if (!validId(authorId)) {
            return false;
        }
        return authorRepository.findAuthorById(authorId).isPresent();
    }

    private boolean validName(String name){
        return name != null && name.length() > 2 && name.length() < 20;
    }

    private boolean validId(Integer id){
        return id != null && id > 0;
    }



    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable Integer id) {
        if(!validId(id) ||!authorExists(id)){
            throw new ResponseStatusException(NOT_FOUND, "Author with id: (" + id + ") not found");
        }
        return authorRepository.findById(id).get();
    }

    @GetMapping("/author/author/{name}")
    public Author getAuthorByName(@PathVariable String name) {
        return authorRepository.findAuthorByFullName(name).get();
    }



    @GetMapping("/authors")
    public List<Author> getAuthorsByName(@RequestParam(required = false) String name) {
        if (name == null) {
            return authorRepository.findAll();
        } else {
        return authorRepository.findAll().stream()
                .filter(author -> author.getFullName().toLowerCase().contains(name.toLowerCase()))
                .toList();
        }
    }

    @PutMapping("/author/{id}")
    public Author updateAuthor(@PathVariable Integer id, @RequestBody Author author) {

        if (!authorExists(id)) {
            throw new ResponseStatusException(NOT_FOUND, "Unable to find author with id " + id);
        }

        Author authorToUpdate = authorRepository.findById(id).get();
        authorToUpdate.setFullName(author.getFullName());
        return authorRepository.save(authorToUpdate);
    }

    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author) {
//        if (!validName(author.getFullName()) || authorExists(author.getId())) {
//            throw new ResponseStatusException(BAD_REQUEST, "Invalid author body");
//        }
        return authorRepository.save(author);
    }

    @DeleteMapping("author/{id}")
    public Author deleteAuthor(@PathVariable Integer id) {
        Author authorToDelete = authorRepository.findById(id).orElse(null);
        if (authorToDelete == null) {
            throw new ResponseStatusException(NOT_FOUND, "Unable to find author with id " + id);
        } else{
            authorRepository.delete(authorToDelete);
        }
        return authorToDelete;
    }


}
