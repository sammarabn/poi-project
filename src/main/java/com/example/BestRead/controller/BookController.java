package com.example.BestRead.controller;

import com.example.BestRead.model.Book;
import com.example.BestRead.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Book> getBook(){
        return bookService.findBookByName();
    }

    @PostMapping("/")
    public Book createBook(@RequestBody Book book){
       return bookService.createBook(book);
    }

}
