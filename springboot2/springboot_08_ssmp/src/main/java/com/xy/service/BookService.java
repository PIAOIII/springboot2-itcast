package com.xy.service;

import com.xy.domain.Book;

import java.util.List;

public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Boolean getById(Integer id);
    List<Book> getAll();

}
