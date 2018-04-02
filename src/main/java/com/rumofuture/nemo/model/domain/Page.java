package com.rumofuture.nemo.model.domain;

import com.rumofuture.nemo.model.entity.NemoEntity;

import java.io.Serializable;

/**
 * @author 王振琦 2017/1/29
 */
public class Page extends NemoEntity implements Serializable {
    /**
     * 所属漫画册
     */
    private Book book;
    /**
     * 图像URL
     */
    private String image;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
