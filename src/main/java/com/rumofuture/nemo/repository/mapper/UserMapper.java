package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户表数据映射
 *
 * @author 王振琦  2017/12/21
 */
@Mapper
@Repository(value = "userMapper")
public interface UserMapper extends NemoMapper<User, Integer> {
    /**
     * 根据用户手机号查询用户对象
     *
     * @param mobilePhoneNumber 用户手机号
     * @return 目标对象
     */
    User selectByMobilePhoneNumber(String mobilePhoneNumber);
}
