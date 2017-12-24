package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.User;

import java.util.List;

public interface UserDao extends NemoDao<User, Integer> {
    User findByMobilePhoneNumber(String mobilePhoneNumber);
    List<User> findAllByAuthorId(Integer id);
}
