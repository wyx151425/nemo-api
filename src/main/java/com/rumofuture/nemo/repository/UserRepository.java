package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.cache.NemoCache;
import com.rumofuture.nemo.repository.cache.UserCache;
import com.rumofuture.nemo.repository.mapper.UserMapper;
import com.rumofuture.nemo.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    @Transactional(rollbackFor = Exception.class)
    public void save(User user) {
        if (null == user.getId()) {
            userMapper.insert(user);
        } else if (null == user.getToken()) {
            userCache.setOne(user);
        } else {
            userCache.setToken(user.getToken(), user.getId());
            userCache.setOne(user);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        User user = new User();
        user.setId(id);
        user.setStatus(0);
        userMapper.update(user);
    }

    @Override
    public User findOne(Integer id) {
        User user = userCache.getOne(id);
        if (null == user) {
            return userMapper.selectOne(id);
        }
        return user;
    }

    @Override
    @Deprecated
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(PageModel pageModel) {
        return userMapper.selectList(pageModel);
    }
}
