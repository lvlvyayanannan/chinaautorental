package com.kgc.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:36 2019/8/14
 */
@Data           // 添加setter getter 方法 重新toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class user implements Serializable {
    private Integer id;             // 我的信息主键id
    private String userName;        // 姓名
    private String idNumber;        // 证件号码 /身份证/驾驶证
    private Date inDate;            // 有效期
    private String phone;           // 手机号码
    private String email;           // 电子邮件
    private String address;         // 通信地址
    private String emergencyName;   // 紧急联系人姓名
    private String emergencyPhone;  // 紧急联系人电话
    private String password;        // 登录密码
    private String paymentCode;     // 支付密码
}
