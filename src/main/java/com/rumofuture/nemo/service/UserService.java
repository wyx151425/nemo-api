package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;

public interface UserService {
    User userSignUp(User user);
    User userLogin(User user);

    String createToken(Integer id);
    void deleteToken(Integer id);
}
