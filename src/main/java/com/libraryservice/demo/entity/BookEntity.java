package com.libraryservice.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookEntity {
    @Id
    int bookId;
    String title;
    long price;

    public BookEntity() {
    }
}
