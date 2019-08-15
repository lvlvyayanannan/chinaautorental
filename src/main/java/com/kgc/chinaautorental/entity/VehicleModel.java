package com.kgc.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 23:02 2019/8/14
 */
@Data           // 添加setter getter 方法 重新toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class VehicleModel implements Serializable {
    private Integer id;         // 车型id
    private String modelName;   // 车型名称
}
