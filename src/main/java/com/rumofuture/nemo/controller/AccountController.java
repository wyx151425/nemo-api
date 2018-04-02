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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  王振琦  2018/02/08
 */
@RestController
public class AccountController extends NemoController {

    private static final Log log = LogFactory.getLog(AccountController.class);

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param user   用户数据传输对象
     * @param result 数据绑定结果对象
     * @return 响应对象
     */
    @PostMapping(value = "users/register")
    public Response<User> actionRegister(@Validated({User.Register.class}) @RequestBody User user, BindingResult result) {
        bindingResultInspect(result);
        try {
            userService.register(user);
            return new Response<>(user);
        } catch (NemoException e) {
            log.error("UserController: actionRegister", e);
            throw e;
        } catch (Exception e) {
            log.error("UserController: actionRegister", e);
            throw new NemoException(RespStatus.SYSTEM_ERROR);
        }
    }

    /**
     * 登录
     *
     * @param requestUser 用户数据传输对象
     * @param result      数据绑定结果对象
     * @return 响应对象
     */
    @PostMapping(value = "users/login")
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
}
