package com.rumofuture.nemo.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Nemo实体类
 *
 * @author 王振琦  2018/1/1
 */
public class NemoEntity implements Serializable {
    /**
     * 数据库主键
     */
    private Integer id;
    /**
     * 对象主键
     */
    private String objectId;
    /**
     * 对象状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    @DateTimeFormat
    private LocalDateTime createAt;
    /**
     * 更新时间
     */
    @DateTimeFormat
    private LocalDateTime updateAt;

    public NemoEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
