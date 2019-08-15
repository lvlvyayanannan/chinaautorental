package com.kgc.chinaautorental.service;


import com.kgc.chinaautorental.entity.User;

import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 12:16 2019/8/15
 */

public interface LoginRegisterService {
    // 用户登录
    Map login(String phone, String password);

    // 用户注册
    Map register(User user);
}
