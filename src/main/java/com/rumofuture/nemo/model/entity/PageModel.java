package com.rumofuture.nemo.model.entity;

/**
 * 分页数据模型类
 *
 * @author 王振琦 2018/1/2
 */
public class PageModel {
    private int index;
    private int limit;
    private int count;
    private int total;

    public PageModel() {
    }

    public PageModel(int index, int limit) {
        this.index = index;
        this.limit = limit;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
