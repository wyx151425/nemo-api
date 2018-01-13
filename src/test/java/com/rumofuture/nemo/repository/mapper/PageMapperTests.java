package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.domain.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PageMapperTests {

    @Autowired
    private PageMapper pageMapper;

    @Test
    public void testInsert() {
        Page page = new Page();
        page.setObjectId(UUID.randomUUID().toString().replace("-", ""));
        page.setStatus(1);
        Book book = new Book();
        book.setId(1);
        page.setBook(book);
        page.setImageUrl("http://bmob-cdn-6637.b0.upaiyun.com/2017/09/22/b02eded8e7ea4f3487500a8ca453d56e.jpg");
        pageMapper.insert(page);
    }

    @Test
    public void testUpdate() {
        Page page = new Page();
        page.setId(1);
        page.setImageUrl("http://bmob-cdn-6637.b0.upaiyun.com/2017/09/22/828d5c468bbb46519378aa05af787a0e.jpg");
        pageMapper.update(page);
    }
}
