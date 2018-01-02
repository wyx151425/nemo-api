package com.rumofuture.nemo.repository.cache;

import com.alibaba.fastjson.JSON;
import com.rumofuture.nemo.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "userCache")
public class UserCache {

    private static final String USER = "user:";
    private static final String TOKEN = "token:";
    private static final String WEB_TOKEN = "token:web:";

    @Autowired
    private NemoCache nemoCache;

    public void set(Integer id, User user) {
        String key = USER + id;
        String value = JSON.toJSONString(user);
        nemoCache.set(USER + id, value);
    }

    public void get(Integer id) {

    }

    public void setToken() {

    }

    public void getToken() {

    }
}
