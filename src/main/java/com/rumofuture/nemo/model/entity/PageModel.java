package com.rumofuture.nemo.model.entity;

/**
 * @author WangZhenqi 2018/1/1
 */
public class PageModel {
    private int index;
    private int limit;
    private int count;
    private int total;

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
