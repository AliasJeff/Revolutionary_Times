package com.zhexun.controller;

import com.zhexun.commen.R;
import com.zhexun.pojo.User;
import com.zhexun.service.UserService;
import com.zhexun.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

//使用@Controller定义Bean
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService = new UserServiceImpl();

    @PostMapping("/login")
    public R<String> login(String username, String upassword) {
        User user = new User();
        user.setUname(username);
        user.setUpassword(upassword);
        boolean success = userService.login(user);
        if(success) {
            return R.success(username);
        }
        return R.error("登录失败");
    }

    @PostMapping("/register")
    public R<String> register(String username, String upassword) {
        User user = new User();
        user.setUname(username);
        user.setUpassword(upassword);
        boolean success = userService.register(user);
        if(success) {
            return R.success("注册成功");
        }
        return R.error("登录失败");
    }

    @GetMapping
    public User getInfo(String username) {
        return userService.selectByUname(username);
    }
}
