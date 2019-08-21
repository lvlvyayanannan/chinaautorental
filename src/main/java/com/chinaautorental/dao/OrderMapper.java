package com.chinaautorental.dao;

import com.chinaautorental.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 11:15 2019/8/17
 */
public interface OrderMapper {
    // 添加订单
    Integer insertOrder(Order order);

    // 修改订单
    Integer updateOrder(Order order);

    // 查询订单
    Order getOrderById(@Param("id") Integer id);
}
