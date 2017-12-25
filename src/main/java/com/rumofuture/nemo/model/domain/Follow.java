package com.rumofuture.nemo.model.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/4/18.
 */

public class Follow implements Serializable {

    private Integer id;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private User author;
    private User follower;

    public Follow() {

    }

    public Follow(User author, User follower) {
        this.author = author;
        this.follower = follower;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }
}
