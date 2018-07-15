package com.example.demo.service;

import com.example.demo.model.Book;

public interface IBookService {
    Book getBook(long id);

    Book addBook(Book book);

}
