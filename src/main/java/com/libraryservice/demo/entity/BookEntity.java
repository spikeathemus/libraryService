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

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
