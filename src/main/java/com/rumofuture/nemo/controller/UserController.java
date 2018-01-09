package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.service.UserService;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户数据 API
 *
 * @author 王振琦  2017/11/30
 */
@RestController
@RequestMapping(value = "user")
public class UserController extends NemoController {

    private static final Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param user   用户数据传输对象
     * @param result 数据绑定结果对象
     * @return 响应对象
     */
    @PostMapping(value = "register")
    public Response<User> actionRegister(@Validated({User.Register.class}) @RequestBody User user, BindingResult result) {
        bindingResultInspect(result);
        userService.register(user);
        return new Response<>(RespStatus.SUCCESS);
    }

    /**
     * 登录
     *
     * @param requestUser 用户数据传输对象
     * @param result      数据绑定结果对象
     * @return 响应对象
     */
    @PostMapping(value = "login")
    public Response<User> actionLogin(@Validated({User.Login.class}) @RequestBody User requestUser, BindingResult result) {
        bindingResultInspect(result);
        try {
            User user = userService.login(requestUser);
            return new Response<>(user);
        } catch (NemoException e) {
            log.error("UserController: actionLogin", e);
            throw e;
        } catch (Exception e) {
            log.error("UserController: actionLogin", e);
            throw new NemoException(RespStatus.SYSTEM_ERROR);
        }
    }

    /**
     * 更新
     *
     * @param user 用户数据
     * @return 响应对象
     */
    @PostMapping(value = "update")
    public Response<User> actionUpdate(@RequestBody User user) {
        try {
            userService.update(user);
            return new Response<>();
        } catch (Exception e) {
            log.error("UserController: actionUpdate", e);
            throw new NemoException(RespStatus.STATUS_ERROR);
        }
    }

    /**
     * 查询漫画作者列表
     *
     * @param index 分页索引
     * @return 响应对象
     */
    @GetMapping(value = "list")
    public Response<List<User>> actionQueryAuthorList(@RequestParam("index") Integer index) {
        List<User> userList = userService.queryAuthorList(index);
        return new Response<>(userList);
    }
}
