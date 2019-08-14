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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class user implements Serializable {
    private Integer id;
    private String userName;
    private String idNumber;
    private Date inDate;
    private String phone;
    private String email;
    private String address;
    private String emergencyName;
    private String emergencyPhone;
    private String password;
    private String paymentCode;
}
