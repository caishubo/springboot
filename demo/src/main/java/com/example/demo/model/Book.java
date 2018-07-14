package com.example.demo.model;

/**
 *
 */
public class Book {
    private String id;
    private String Name;

    public Book() {

    }

    public Book(String id, String name) {
        this.id = id;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }
}