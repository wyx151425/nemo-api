package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.service.UserService;
import com.rumofuture.nemo.util.constant.RespConst;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangZhenqi
 */
@RestController
@RequestMapping(value = "user")
public class UserController extends NemoController {

    private static final Log log = LogFactory.getLog(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "register")
    public Response<String> actionRegister(@Validated({User.Register.class}) @RequestBody User user, BindingResult result) {
        bindingResultInspect(result);
        userService.register(user);
        return new Response<>(RespConst.SUCCESS);
    }

    @PostMapping(value = "login")
    public Response<?> actionLogin(@Validated({User.Login.class}) @RequestBody User requestUser, BindingResult result) {
        bindingResultInspect(result);
        try {
            User user = userService.login(requestUser);
            return new Response<>(user);
        } catch (NemoException e) {
            log.error(e);
            throw e;
        } catch (Exception e) {
            log.error(e);
            throw new NemoException(RespConst.SYSTEM_ERROR);
        }
    }
}
