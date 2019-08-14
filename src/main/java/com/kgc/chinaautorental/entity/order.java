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
 * @Date: Create in 22:16 2019/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class order implements Serializable {
    private Integer id;
    private Integer orderStatusId;
    public Double orderPrice;
    private String orderNum;
    private Integer rentalMsgId;
    private Integer lease;
    public Double authorization;
    private Integer vehicleMsgId;
    private Date pickTime;
    private Integer pickShopId;
    private Date returnTime;
    private Integer returnShopId;
    private Integer limitMileage;

}
