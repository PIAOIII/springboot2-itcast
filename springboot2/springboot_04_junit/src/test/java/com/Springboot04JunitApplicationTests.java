package com;

import com.xy.Springboot04JunitApplication;
import com.xy.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot04JunitApplication.class)
class Springboot04JunitApplicationTests {
    // 1. 注入要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2. 执行要测试的对象的方法
        bookDao.save();
    }

}
