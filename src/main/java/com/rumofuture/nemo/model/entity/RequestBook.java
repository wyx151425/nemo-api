package com.rumofuture.nemo.model.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 漫画册数据传输对象
 *
 * @author 王振琦  2018/1/7
 */
public class RequestBook {
    /**
     * 所属漫画作者
     */
    @NotNull
    private Integer authorId;
    /**
     * 漫画册名称
     */
    @NotBlank
    private String name;
    /**
     * 漫画册所属风格
     */
    @NotBlank
    private String style;
    /**
     * 漫画册简介
     */
    @NotBlank
    private String introduction;
    /**
     * 资源路径
     */
    private String sourceUrl;
    /**
     * 漫画册封面路径
     */
    @NotNull
    private MultipartFile cover;
    /**
     * 漫画册类型（0本地/1网页链接）
     */
    @NotNull
    private Integer type;
    /**
     * 漫画册是否公开
     */
    @NotNull
    private Boolean open;
    /**
     * 漫画册是否是自己原创
     */
    @NotNull
    private Boolean copyright;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
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

    public MultipartFile getCover() {
        return cover;
    }

    public void setCover(MultipartFile cover) {
        this.cover = cover;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }
}
