package com.chinaautorental.controller;

import com.chinaautorental.service.LoginRegisterService;
import com.chinaautorental.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 12:23 2019/8/15
 */
@RestController
public class LoginRegisterController {

    @Resource
    private LoginRegisterService loginService;

    // 用户登录
    @RequestMapping("/login")
    public Map login(@RequestParam String phone, @RequestParam String password) {
        return loginService.login(phone,password);
    }

    // 用户注册
    @RequestMapping("/register")
    public Map register(@RequestParam String userName,
                        @RequestParam(required = false) String idNumber,
                        @RequestParam(required = false) Date inDate,
                        @RequestParam String phone,
                        @RequestParam(required = false) String email,
                        @RequestParam(required = false) String address,
                        @RequestParam(required = false) String emergencyName,
                        @RequestParam(required = false) String emergencyPhone,
                        @RequestParam(required = false) String paymentCode,
                        @RequestParam String password) {
        User user = new User();
        user.setIdNumber(idNumber);
        user.setUserName(userName);
        user.setInDate(inDate);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAddress(address);
        user.setEmergencyName(emergencyName);
        user.setEmergencyPhone(emergencyPhone);
        user.setPassword(password);
        user.setPaymentCode(paymentCode);
        return loginService.register(user);
    }
}
