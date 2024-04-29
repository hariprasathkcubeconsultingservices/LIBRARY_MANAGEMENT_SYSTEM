package com.LIBRARY.LIBRARY_MANAGEMENT;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String book;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", book=" + book + "]";
    }

    
    
}
