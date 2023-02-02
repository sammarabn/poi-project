package com.example.BestRead.service;

import com.example.BestRead.dao.BookRepository;
import com.example.BestRead.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findBookByName(){

        List<Book> book = bookRepository.findAll();

        return book;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }
}
