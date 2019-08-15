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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class VehicleModel implements Serializable {
    private Integer id;         // 车型id
    private String modelName;   // 车型名称
}
