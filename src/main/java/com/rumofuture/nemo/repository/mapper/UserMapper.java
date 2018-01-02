package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository(value = "userMapper")
public interface UserMapper extends NemoMapper<User, Integer> {
    User selectByMobilePhoneNumber(String mobilePhoneNumber);
}
