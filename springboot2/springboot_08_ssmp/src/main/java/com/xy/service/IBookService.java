package com.xy.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xy.domain.Book;
import org.springframework.stereotype.Service;

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

}
