package com.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 14:36 2019/8/17
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class Relation {
    private Integer id;             // 车辆门店联系表
    private Integer districtId;     // 门店id
    private Integer vehicleId;     // 车辆id
}
