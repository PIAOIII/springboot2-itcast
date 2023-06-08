package com.xy.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("python");
        book.setName("python入门");
        book.setDescription("python入门书籍");

        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(3);
        book.setType("C");
        book.setName("C入门");
        book.setDescription("C入门书籍");

        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(4);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(2, 2);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        qw.like("name", "java");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2() {
        String queryCondition = null;
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<Book>();
        qw.like(queryCondition != null, Book::getName, queryCondition);
        bookDao.selectList(qw);
    }
}
