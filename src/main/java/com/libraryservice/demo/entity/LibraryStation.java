package com.libraryservice.demo.entity;

import org.springframework.data.annotation.Id;




public class LibraryStation {
    int LibraryId;
    String adress;
    private BookEntity bookEntity;

    public LibraryStation() {
    }
}
