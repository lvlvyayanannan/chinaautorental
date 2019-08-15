package com.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:31 2019/8/14
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class OrderStatus implements Serializable {
    private Integer id;             // 订单状态id
    private String orderStatus;     // 订单状态
}
