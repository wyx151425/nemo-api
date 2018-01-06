package com.rumofuture.nemo.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class NemoEntity implements Serializable {

    private Integer id;  // 数据库主键
    private String objectId;  // 对象主键
    private LocalDateTime createAt;  // 创建时间
    private LocalDateTime updateAt;  // 更新时间

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
