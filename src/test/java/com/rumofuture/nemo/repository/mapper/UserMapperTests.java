package com.rumofuture.nemo.repository.mapper;

import com.alibaba.fastjson.JSON;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.PageModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    private static final Log log = LogFactory.getLog(UserMapperTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setName("Wang");
        userMapper.update(user);
    }

    @Test
    public void testDelete() {
        userMapper.delete(1);
    }

    @Test
    public void testSelectOne() {
        User user = userMapper.selectOne(1);
        log.error(JSON.toJSONString(user));
    }

    @Test
    public void testSelectList() {
        PageModel pageModel = new PageModel();
        pageModel.setIndex(0);
        pageModel.setLimit(16);
        List<User> userList = userMapper.selectList(pageModel);
        for (User user : userList) {
            log.error(JSON.toJSONString(user));
        }
    }

    @Test
    public void testSelectOneByMobilePhoneNumber() {
        User user = userMapper.selectOneByMobilePhoneNumber("15253620357");
        log.error(JSON.toJSONString(user));
    }
}
