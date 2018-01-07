package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;

/**
 * 用户业务逻辑接口
 *
 * @author 王振琦  2017/11/30
 */
public interface UserService {

    /**
     * 注册方法
     *
     * @param user 用户对象
     * @return 包含ID的用户对象
     */
    User register(User user);

    /**
     * 登录方法
     *
     * @param user 用户对象
     * @return 包含ID的用户对象
     */
    User login(User user);
}
