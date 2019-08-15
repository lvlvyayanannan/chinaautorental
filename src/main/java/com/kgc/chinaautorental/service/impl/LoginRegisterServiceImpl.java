package com.kgc.chinaautorental.service.impl;

import com.kgc.chinaautorental.dao.LoginRegisterMapper;
import com.kgc.chinaautorental.entity.User;
import com.kgc.chinaautorental.service.LoginRegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 12:18 2019/8/15
 */
@Service(value = "servie")
public class LoginRegisterServiceImpl implements LoginRegisterService {

    @Resource
    private LoginRegisterMapper loginMapper;

    // 用户登录
    @Override
    public Map login(String phone, String password) {
        User user = loginMapper.getUserByPhone(phone);
        Map<String,Object> result = new HashMap<>();
        if (user != null) {
            if (user.getPassword().equals(password)) {
                result.put("result", true);
                result.put("data",user);
                result.put("mess", "登录成功");
            } else {
                result.put("result", false);
                result.put("data",null);
                result.put("mess", "登录密码错误");
            }
        } else {
            result.put("result", false);
            result.put("data",null);
            result.put("mess", "用户名不存在");
        }
        return result;
    }

    // 用户注册
    @Override
    public Map register(User user) {
        Integer daoResult = loginMapper.userRegister(user);
        Map<String,Object> result = new HashMap<>();
        if (daoResult > 0) {
            result.put("result", true);
            result.put("data",user);
            result.put("mess", "注册成功");

        } else {
            result.put("result", false);
            result.put("data",null);
            result.put("mess", "注册失败");
        }
        return result;
    }
}
