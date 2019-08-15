package com.kgc.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:13 2019/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class District implements Serializable {
    private Integer id;     // 地区id
    private Integer shopId;     // 门店id
    private String districtName;    // 地区名称
}
