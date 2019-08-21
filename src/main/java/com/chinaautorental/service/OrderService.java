package com.chinaautorental.service;


import com.chinaautorental.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 15:03 2019/8/17
 */
public interface OrderService {
    // 添加订单
    Map insertOrder(Order order);

    // 修改订单
    Map updateOrder(Order order);

    // 查询订单
    Map getOrderById(Integer id);
}
