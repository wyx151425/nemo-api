package com.rumofuture.nemo.model.domain;

import com.rumofuture.nemo.model.entity.NemoEntity;

import java.io.Serializable;

/**
 * @author 王振琦 2016/12/24
 */
public class Book extends NemoEntity implements Serializable {
    /**
     * status 0-删除 1-新建未审核 2-修改未审核 3-审核通过允许展示
     */
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
    private String source;
    /**
     * 漫画册封面路径
     */
    private String cover;
    /**
     * 漫画册漫画分页数
     */
    private Integer page;
    /**
     * 收藏此漫画的用户数
     */
    private Integer favor;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getFavor() {
        return favor;
    }

    public void setFavor(Integer favor) {
        this.favor = favor;
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
