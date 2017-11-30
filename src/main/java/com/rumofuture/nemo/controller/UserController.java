package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.dto.Response;
import com.rumofuture.nemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/signUp")
    public Response<?> actionUserSignUp(@RequestBody User user) {
        User resultUser = userService.userSignUp(user);
        if (null != resultUser.getId()) {
            return new Response<>(200, "success");
        }
        return new Response<>(200, "failed");
    }

    @PostMapping(value = "login")
    public Response<?> actionLogin(@RequestBody User user) {
        User resultUser = userService.userLogin(user);
        String token = userService.createToken(resultUser.getId());
        Map<String, Object> map = new HashMap<>();
        map.put("user", resultUser);
        map.put("token", token);
        return new Response<>(200, map);
    }
}
