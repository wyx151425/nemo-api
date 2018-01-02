package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.cache.NemoCache;
import com.rumofuture.nemo.repository.cache.UserCache;
import com.rumofuture.nemo.repository.mapper.UserMapper;
import com.rumofuture.nemo.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userDao")
public class UserRepository implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCache userCache;


    @Override
    public User findByMobilePhoneNumber(String mobilePhoneNumber) {
        return null;
    }

    @Override
    public void save(User object) {

    }

    @Override
    public void update(User object) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public User findOne(Integer id) {
        userCache.get(id);
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(PageModel pageModel) {
        return userMapper.selectList(pageModel);
    }
}
