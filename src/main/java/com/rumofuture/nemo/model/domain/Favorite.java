package com.rumofuture.nemo.model.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/4/18.
 */

public class Favorite implements Serializable {

    private Integer id;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Book book;
    private User favor;

    public Favorite() {

    }

    public Favorite(Book book, User favor) {
        this.book = book;
        this.favor = favor;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getFavor() {
        return favor;
    }

    public void setFavor(User favor) {
        this.favor = favor;
    }
}
