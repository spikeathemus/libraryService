package com.libraryservice.demo.controller;

import com.libraryservice.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    BookRepository bookRepository;

    @Autowired
    public BookController (BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
@GetMapping(path = {"/sfg"})
    public String Bookadded(String sfg){
        return sfg;
}
}
