package com.rumofuture.nemo.model.domain;

import com.rumofuture.nemo.model.entity.NemoEntity;

/**
 * @author 王振琦 2017/1/29
 */
public class Page extends NemoEntity {
    /**
     * 所属漫画册
     */
    private Book book;
    /**
     * 图像URL
     */
    private String imageUrl;

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
