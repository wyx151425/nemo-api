package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.RequestBook;
import com.rumofuture.nemo.model.entity.Response;
import org.springframework.web.bind.annotation.*;

/**
 * 漫画册数据API
 *
 * @author 王振琦  2018/1/7
 */
@RestController
@RequestMapping(value = "book")
public class BookController extends NemoController {

    @PostMapping(value = "create")
    Response<Book> actionCreate(@RequestBody RequestBook book) {
        return new Response<>();
    }

    @PostMapping(value = "delete")
    Response<Book> actionDelete(@RequestBody Book book) {
        return new Response<>();
    }

    @PostMapping(value = "update")
    Response<Book> actionUpdate(@RequestBody Book book) {
        return new Response<>();
    }

    @GetMapping(value = "listByAuthor")
    Response<Book> actionQueryListByAuthor(@RequestParam("authorId") int authorId) {
        return new Response<>();
    }

    @GetMapping(value = "listWithAuthor")
    Response<Book> actionQueryListContainAuthor(@RequestParam("index") int index) {
        return new Response<>();
    }
}
