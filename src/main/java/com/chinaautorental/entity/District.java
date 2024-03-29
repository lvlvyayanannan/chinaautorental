package com.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: Lvyanan
 * @Description:
 * @Date: Create in 22:13 2019/8/14
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class District implements Serializable {
    private Integer id;     // 地区id
    private String districtName;    // 地区名称
    private Integer cityId;  // 城市id
    private String cityName;  //城市名称
}
