package com.example.demo.service;

import com.example.demo.dao.IBookRepository;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository bookRepository;

    public Book getBook(long id) {
        return bookRepository.findById(id).get();
    }

    public Book addBook(Book book) {
        bookRepository.save(book);
        return book;
    }
}
