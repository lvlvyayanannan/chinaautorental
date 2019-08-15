package com.kgc.chinaautorental.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 11:50 2019/8/15
 */
public interface LoginMapper {
    void login(@Param("phone") String phone, @Param("password") String )
}
