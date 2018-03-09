package com.rumofuture.nemo.model.domain;

import com.rumofuture.nemo.model.entity.NemoEntity;

/**
 * @author 王振琦 2016/12/24
 */
public class Book extends NemoEntity {
    /**
     * 所属漫画作者
     */
    private User author;
    /**
     * 漫画册名称
     */
    private String name;
    /**
     * 漫画册所属风格
     */
    private String style;
    /**
     * 漫画册简介
     */
    private String introduction;
    /**
     * 资源路径
     */
    private String sourceUrl;
    /**
     * 漫画册封面路径
     */
    private String coverUrl;
    /**
     * 漫画册漫画分页数
     */
    private Integer pageTotal;
    /**
     * 收藏此漫画的用户数
     */
    private Integer favorTotal;
    /**
     * 漫画册类型（0本地/1网页链接）
     */
    private Integer type;
    /**
     * 漫画册是否公开
     */
    private Boolean publish;
    /**
     * 漫画册是否是自己原创
     */
    private Boolean copyright;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getFavorTotal() {
        return favorTotal;
    }

    public void setFavorTotal(Integer favorTotal) {
        this.favorTotal = favorTotal;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }
}
