package com.kgc.chinaautorental.dao;

import com.kgc.chinaautorental.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 11:50 2019/8/15
 */
public interface LoginRegisterMapper {
    // 用户登录
    User getUserByPhone(@Param("phone") String phone);

    // 用户注册
    Integer userRegister(User user);
}
