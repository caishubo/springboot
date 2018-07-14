package com.example.demo.service;

import com.example.demo.model.Book;

public interface IBookService {
    Book getBook(String id);

    Book addBook(String name);

}
