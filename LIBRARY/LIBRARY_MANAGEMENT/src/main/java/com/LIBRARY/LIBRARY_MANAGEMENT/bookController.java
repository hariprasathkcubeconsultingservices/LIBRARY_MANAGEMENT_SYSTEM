package com.LIBRARY.LIBRARY_MANAGEMENT;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/books")
public class bookController {
    
    private BookService ser;

    @GetMapping
    public List<Book> getAllBook(){
        return ser.findAll();
    }

    @PostMapping()
    public Book addBook(@RequestBody Book book) {
       
        return ser.save(book);
        
    }
    

}
