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
@Data           // 添加setter getter 方法 重新toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class order implements Serializable {
    private Integer id;     //订单中心主键id
    private Integer orderStatusId;      // 订单状态id
    public Double orderPrice;       // 订单总价
    private String orderNum;        // 订单号
    private Integer rentalMsgId;    // 租车人信息
    private Integer lease;          // 租期
    public Double authorization;    // 取车时需刷预授权
    private Integer vehicleMsgId;   // 车辆基本信息id
    private Date pickTime;          // 取车时间
    private Integer pickShopId;     // 取车地点门店id
    private Date returnTime;        // 还车时间
    private Integer returnShopId;   // 还车地点门店id
    private Integer limitMileage;   // 限定总里程
    //private String SS;//shan

}
