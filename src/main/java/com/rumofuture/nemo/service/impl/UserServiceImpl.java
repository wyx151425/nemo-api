package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.repository.UserRepository;
import com.rumofuture.nemo.service.UserService;
import com.rumofuture.nemo.util.constant.RespStatus;
import com.rumofuture.nemo.util.generator.Generator;
import org.springframework.beans.factory.annotation.Autowired;
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
            userRepository.save(user);
            return user;
        } else {
            throw new NemoException(RespStatus.USER_REGISTERED);
        }
    }

    @Override
    public User login(User user) {
        User targetUser =  userRepository.findByMobilePhoneNumber(user.getMobilePhoneNumber());
        if (null == targetUser) {
            throw new NemoException(RespStatus.USER_UNREGISTER);
        } else {
            if (targetUser.getPassword().equals(user.getPassword())) {
                String token = Generator.getToken();
                targetUser.setToken(token);
                userRepository.save(targetUser);
                return targetUser;
            } else {
                throw new NemoException(RespStatus.USER_LOGIN_PASSWORD_ERROR);
            }
        }
    }
}
