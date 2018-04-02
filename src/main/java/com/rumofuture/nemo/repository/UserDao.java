package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.User;

/**
 * @author 王振琦 2018/1/2
 */
public interface UserDao extends NemoDao<User, Integer> {
    /**
     * 根据手机号获取用户对象
     *
     * @param mobilePhoneNumber 目标对象的手机号
     * @return 目标对象
     */
    User findOneByMobilePhoneNumber(String mobilePhoneNumber);

    /**
     * 将用户存入缓存中
     *
     * @param user 目标用户
     */
    void saveCache(User user);
}
