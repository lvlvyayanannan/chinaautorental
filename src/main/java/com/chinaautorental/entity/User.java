package com.chinaautorental.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:36 2019/8/14
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class User implements Serializable {
    private Integer id;             // 我的信息主键id
    private String userName;        // 姓名
    private String idNumber;        // 证件号码 /身份证/驾驶证
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inDate;            // 有效期
    private String phone;           // 手机号码
    private String email;           // 电子邮件
    private String address;         // 通信地址
    private String emergencyName;   // 紧急联系人姓名
    private String emergencyPhone;  // 紧急联系人电话
    private String password;        // 登录密码
    private String paymentCode;     // 支付密码
}
