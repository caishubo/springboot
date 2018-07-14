package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService implements IBookService {

    private List<Book> bookList = new ArrayList();

    public Book getBook(String id) {

        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }

        return null;

    }

    public Book addBook(String name) {
        Book book = new Book(UUID.randomUUID().toString(), name);
        bookList.add(book);
        return book;
    }
}
