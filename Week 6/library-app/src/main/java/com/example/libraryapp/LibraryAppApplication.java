package com.example.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryAppApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
//        return args -> {
//            System.out.println(authorRepository.findAll());
//            System.out.println(bookRepository.findBooksByAuthorId_fullName("Daniell Bow"));
//        };
//    }

}
