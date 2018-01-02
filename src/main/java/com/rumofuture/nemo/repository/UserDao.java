package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.User;

public interface UserDao extends NemoDao<User, Integer> {
    User findByMobilePhoneNumber(String mobilePhoneNumber);
}
