package com.libraryservice.demo.entity;

import org.springframework.data.annotation.Id;




public class LibraryStation {
    int LibraryId;
    String adress;
    private BookEntity bookEntity;

    public LibraryStation() {
    }

    public int getLibraryId() {
        return LibraryId;
    }

    public void setLibraryId(int libraryId) {
        LibraryId = libraryId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }
}
