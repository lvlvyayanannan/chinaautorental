package com.chinaautorental.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:16 2019/8/14
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class Order implements Serializable {
    private Integer id;     //订单中心主键id
    private Integer orderStatusId;      // 订单状态id
    private Double orderPrice;       // 订单总价
    private String orderNum;        // 订单号
    private Integer rentalMsgId;    // 租车人信息
    private Integer lease;          // 租期
    private Double authorization;    // 取车时需刷预授权
    private Integer vehicleMsgId;   // 车辆基本信息id
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pickTime;          // 取车时间
    private Integer pickShopId;     // 取车地点门店id
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date returnTime;        // 还车时间
    private Integer returnShopId;   // 还车地点门店id
    private Integer limitMileage;   // 限定总里程
//    WebMvcAutoConfiguration

    private OrderStatus orderStatus;    // 订单状态

    private User user;      // 租车人信息
}
