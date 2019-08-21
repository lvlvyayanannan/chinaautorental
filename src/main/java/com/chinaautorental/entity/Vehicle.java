package com.chinaautorental.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:44 2019/8/14
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class Vehicle implements Serializable {
    private Integer id;             // 车辆id
    private Integer brandId;           // 品牌id
    private String demio;           // 车系
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date timeStyle;         // 年代款
    private String allocation;      // 配置款
    private Integer seating;        // 座位数
    private Integer carDoor;        // 车门数
    private String bunkers;         // 燃料类型
    private Integer displacement;   // 排量
    private String bunkersNum;      // 燃料标号
    private char skyLight;          // 天窗
    private Integer fuelTank;       // 邮箱容量
    private Integer sound;          // 音响
    private Integer seat;           // 座椅
    private String radar;           // 倒车雷达
    private Integer gasbag;         // 气囊
    private String DVD;             // DVC/CD
    private String GPS;             // GPS导航
    public Double price;            // 价格
    private Integer vehicleModelId;      // 车型id
}
