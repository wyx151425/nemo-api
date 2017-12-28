package com.rumofuture.nemo.repository.impl;

import com.rumofuture.nemo.model.dao.UserDao;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.repository.UserRepository;
import com.rumofuture.nemo.util.NemoCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserDao userDao;

    @Autowired
    private NemoCache nemoCache;

    @Override
    public boolean save(User user) {
        int row = userDao.save(user);
        if (1 == row) return true;
        else return false;
    }

    @Override
    public boolean update(User user) {
        int
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public User findByMobilePhoneNumber(String mobilePhoneNumber) {
        return null;
    }
}
