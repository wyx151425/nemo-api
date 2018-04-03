package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.cache.UserCache;
import com.rumofuture.nemo.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 王振琦 2017/11/30
 */
@Repository(value = "userDao")
public class UserRepository implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCache userCache;

    @Override
    public void save(User user) {
        userMapper.insert(user);
        userCache.setOne(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
        userCache.deleteOne(user.getId());
        userCache.setOne(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
        userCache.deleteOne(id);
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
    public List<User> findList(PageModel pageModel) {
        return userMapper.selectList(pageModel);
    }

    @Override
    public User findOneByMobilePhoneNumber(String mobilePhoneNumber) {
        return userMapper.selectOneByMobilePhoneNumber(mobilePhoneNumber);
    }

    @Override
    public void saveCache(User user) {
        userCache.setToken(user.getToken(), user.getId());
        userCache.setOne(user);
    }

    @Override
    public List<User> findAuthorList(PageModel pageModel) {
        return userMapper.selectAuthorList(pageModel);
    }
}
