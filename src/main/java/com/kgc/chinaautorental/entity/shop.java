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
    private Integer id;             // 门店id
    private String shopName;        // 门店名称
    private String contactNumber;   // 联系电话
    private String address;         // 详细地址
    private Date business;          // 营业时间
    private Integer vehicle;        // 车辆id
}
