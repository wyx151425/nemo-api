package com.rumofuture.nemo.model.domain;

/**
 * Created by WangZhenqi on 2017/1/29.
 */

public class Page {

    private Book book;  // 所属漫画册
    private String imageUrl;  // 图像

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
