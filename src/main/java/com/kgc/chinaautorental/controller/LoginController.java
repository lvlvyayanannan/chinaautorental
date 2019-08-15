package com.kgc.chinaautorental.controller;

import com.kgc.chinaautorental.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 12:23 2019/8/15
 */
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public Map login(@RequestParam String phone, @RequestParam String password) {
        return loginService.login(phone,password);
    }
}
