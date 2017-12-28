package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userDao")
public interface UserDao extends NemoDao<User, Integer> {
    User findByMobilePhoneNumber(String mobilePhoneNumber);
    List<User> findAllByAuthorId(Integer id);
}
