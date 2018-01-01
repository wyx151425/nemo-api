package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.User;

public interface UserRepository {
    boolean save(User user);
    boolean update(User user);
    boolean delete(Integer id);
    User findByMobilePhoneNumber(String mobilePhoneNumber);
}
