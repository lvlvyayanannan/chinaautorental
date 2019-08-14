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
 * @Date: Create in 22:44 2019/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Vehicle implements Serializable {
    private Integer id;
    private String brand;
    private String demio;
    private Date timeStyle;
    private String allocation;
    private Integer seating;
    private Integer carDoor;
    private String bunkers;
    private Integer displacement;
    private String bunkersNum;
    private char skyLight;
    private Integer fuelTank;
    private Integer sound;
    private Integer seat;
    private String radar;
    private Integer gasbag;
    private String DVD;
    private String GPS;
    public Double price;
    private Integer vehicleId;
}
