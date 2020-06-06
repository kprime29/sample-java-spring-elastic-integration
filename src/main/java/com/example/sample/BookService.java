package com.example.sample;

public interface BookService {

    Book save(Book book);


    Iterable<Book> findAll();


}