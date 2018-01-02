package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.entity.Token;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.repository.UserRepository;
import com.rumofuture.nemo.service.UserService;
import com.rumofuture.nemo.util.constant.RespConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        User targetUser = userRepository.findByMobilePhoneNumber(user.getMobilePhoneNumber());
        if (null == targetUser) {
            userRepository.save(user);
            return user;
        } else {
            throw new NemoException(RespConst.STATUS_ERROR);
        }
    }

    @Override
    public User login(User user) {
        return userRepository.findByMobilePhoneNumber(user.getMobilePhoneNumber());
    }

    @Override
    @Cacheable(cacheNames = "token", key = "#id")
    public String createToken(Integer id) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("nemo:token:");
        buffer.append(id + System.currentTimeMillis());
        String token = buffer.toString();
        saveToken(token, id);
        return token;
    }

    @Override
    public void deleteToken(Integer id) {

    }

    @CachePut(cacheNames = "token", key = "#token")
    public Token saveToken(String token, Integer id) {
        Token tokenObject = new Token();
        tokenObject.setId(id);
        return tokenObject;
    }
}
