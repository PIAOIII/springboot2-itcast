package com.xy;

import com.xy.dao.BookDao;
import com.xy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
    }

}
