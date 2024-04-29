package com.LIBRARY.LIBRARY_MANAGEMENT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    

    @Autowired
    private bookrepo bookrepo;

    // @Autowired
    // private userrepo userrepo;

    public List<Book> findAll() {
        return bookrepo.findAll();
    }

        
    public Book save(Book book) {
        return bookrepo.save(book);

    }
    

}
