package com.rumofuture.nemo.model.domain;

import java.io.Serializable;

/**
 * Created by WangZhenqi on 2017/9/21.
 */

public class Device implements Serializable {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
