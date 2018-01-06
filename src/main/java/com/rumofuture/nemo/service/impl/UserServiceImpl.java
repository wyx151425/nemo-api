package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.entity.Token;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.repository.UserRepository;
import com.rumofuture.nemo.service.UserService;
import com.rumofuture.nemo.util.constant.RespConst;
import com.rumofuture.nemo.util.generator.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        User targetUser = userRepository.findByMobilePhoneNumber(user.getMobilePhoneNumber());
        if (null == targetUser) {
            user.setObjectId(Generator.getUUID());
            user.setStatus(1);
            user.setCreateAt(LocalDateTime.now().withNano(0));
            user.setUpdateAt(LocalDateTime.now().withNano(0));
            user.setEmail("");
            user.setMotto("");
            user.setProfile("");
            user.setProfession("");
            user.setLocation("");
            user.setGender("保密");
            user.setBirthday(LocalDate.now().toString());
            user.setAge(0);
            user.setFollowTotal(0);
            user.setFollowerTotal(0);
            user.setFavoriteTotal(0);
            user.setBookTotal(0);
            userRepository.save(user);
            return user;
        } else {
            throw new NemoException(RespConst.USER_UNREGISTER);
        }
    }

    @Override
    public User login(User userDto) {
        User targetUser =  userRepository.findByMobilePhoneNumber(userDto.getMobilePhoneNumber());
        if (null == targetUser) {
            throw new NemoException(RespConst.USER_UNREGISTER);
        } else {
            if (targetUser.getPassword().equals(userDto.getPassword())) {
                String token = Generator.getToken();
                targetUser.setToken(token);
                userRepository.save(targetUser);
                return targetUser;
            } else {
                throw new NemoException(RespConst.USER_LOGIN_PASSWORD_ERROR);
            }
        }
    }
}
