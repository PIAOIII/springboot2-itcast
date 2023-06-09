package com.xy.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("C++");
        book.setName("C++入门");
        book.setDescription("C++入门书籍");

        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(7);
        book.setType("C#");
        book.setName("C#入门");
        book.setDescription("C#入门书籍");

        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(5);
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = bookService.getPage(1, 2);
    }
//
//    @Test
//    void testGetBy() {
//        QueryWrapper<Book> qw = new QueryWrapper<Book>();
//        qw.like("name", "java");
//        bookService.selectList(qw);
//    }
//
//    @Test
//    void testGetBy2() {
//        String queryCondition = null;
//        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<Book>();
//        qw.like(queryCondition != null, Book::getName, queryCondition);
//        bookService.selectList(qw);
//    }
}
