package com.kgc.chinaautorental.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 12:16 2019/8/15
 */
public interface LoginService {
    Map login(String phone, String password);
}
