package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

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

    /**
     * 更新方法
     *
     * @param user 目标用户
     */
    void update(User user);

    /**
     * 根据索引获取漫画册作者列表
     *
     * @param index 分页索引
     * @return 漫画册作者列表
     */
    List<User> queryAuthorList(Integer index);
}
