package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;

public interface UserService {
    User register(User user);
    User login(User user);

    String createToken(Integer id);
    void deleteToken(Integer id);
}
