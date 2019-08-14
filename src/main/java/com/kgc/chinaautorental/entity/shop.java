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
 * @Date: Create in 22:32 2019/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class shop implements Serializable {
    private Integer id;
    private String shopName;
    private String contactNumber;
    private String address;
    private Date business;
    private Integer vehicle;
}
