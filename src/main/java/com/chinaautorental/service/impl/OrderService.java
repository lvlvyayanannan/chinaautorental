package com.chinaautorental.service.impl;

import com.chinaautorental.dao.OrderMapper;
import com.chinaautorental.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 15:04 2019/8/17
 */
@Service
public class OrderService implements com.chinaautorental.service.OrderService {

    @Resource
    private OrderMapper orderMapper;


    // 添加订单
    @Override
    public Map insertOrder(Order order) {
        Map<String,Object> result = new HashMap<>();
        Integer daoResult = orderMapper.insertOrder(order);
        if (daoResult > 0) {
            result.put("result", true);
            result.put("data",order);
            result.put("mess", "订单添加成功");

        } else {
            result.put("result", false);
            result.put("data",null);
            result.put("mess", "订单添加失败");
        }
        return result;
    }

    // 修改订单
    @Override
    public Map updateOrder(Order order) {
        Map<String,Object> result = new HashMap<>();
        Integer daoResult = orderMapper.updateOrder(order);
        if (daoResult > 0) {
            result.put("result", true);
            result.put("data",order);
            result.put("mess", "订单修改成功");

        } else {
            result.put("result", false);
            result.put("data",null);
            result.put("mess", "订单修改失败");
        }
        return result;
    }

    @Override
    public Map getOrderById(Integer id) {
        Map<String,Object> result = new HashMap<>();
        Order order = orderMapper.getOrderById(id);
        if (order != null) {
            result.put("result", true);
            result.put("data",order);
            result.put("mess", "订单查询成功");

        } else {
            result.put("result", false);
            result.put("data",null);
            result.put("mess", "订单查询失败");
        }
        return result;
    }
}
