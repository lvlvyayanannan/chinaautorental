package com.chinaautorental.controller;

import com.chinaautorental.entity.Order;
import com.chinaautorental.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 15:09 2019/8/17
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    // 添加订单
    @RequestMapping("/insertOrder")
    public Map insertOrder(@RequestParam (required = false) Integer orderStatusId,
                           @RequestParam(required = false) Integer rentalMsgId,
                           @RequestParam(required = false) Integer lease,
                           @RequestParam(required = false) Double authorization,
                           @RequestParam(required = false) Integer vehicleMsgId,
                           @RequestParam(required = false) Date pickTime,
                           @RequestParam(required = false) Integer pickShopId,
                           @RequestParam(required = false) Date returnTime,
                           @RequestParam(required = false) Integer returnShopId,
                           @RequestParam(required = false) Integer limitMileage,
                           @RequestParam(required = false) Double orderPrice) {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        order.setOrderNum(sdf.format(new Date()));
        order.setOrderStatusId(orderStatusId);
        order.setOrderPrice(orderPrice);
        order.setRentalMsgId(rentalMsgId);
        order.setLease(lease);
        order.setAuthorization(authorization);
        order.setVehicleMsgId(vehicleMsgId);
        order.setPickTime(pickTime);
        order.setPickShopId(pickShopId);
        order.setReturnTime(returnTime);
        order.setReturnShopId(returnShopId);
        order.setLimitMileage(limitMileage);
        return orderService.insertOrder(order);
    }

    // 修改订单
    @RequestMapping("/updateOrder")
    public Map updateOrder(@RequestParam (required = false) Integer orderStatusId,
                           @RequestParam(required = false) Integer rentalMsgId,
                           @RequestParam(required = false) Integer id,
                           @RequestParam(required = false) Integer lease,
                           @RequestParam(required = false) Double authorization,
                           @RequestParam(required = false) Integer vehicleMsgId,
                           @RequestParam(required = false) String pickTime,
                           @RequestParam(required = false) Integer pickShopId,
                           @RequestParam(required = false) String returnTime,
                           @RequestParam(required = false) Integer returnShopId,
                           @RequestParam(required = false) Integer limitMileage,
                           @RequestParam(required = false) Double orderPrice) {
        Order order = new Order();
        order.setId(id);
        order.setOrderStatusId(orderStatusId);
        order.setOrderPrice(orderPrice);
        order.setRentalMsgId(rentalMsgId);
        order.setLease(lease);
        order.setAuthorization(authorization);
        order.setVehicleMsgId(vehicleMsgId);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            order.setPickTime(sdf.parse(pickTime));
            order.setReturnTime(sdf.parse(returnTime));
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("格式转换错误!!");
        }
        order.setPickShopId(pickShopId);
        order.setReturnShopId(returnShopId);
        order.setLimitMileage(limitMileage);
        return orderService.updateOrder(order);
    }

    // 查询订单
    @RequestMapping("/getOrder")
    public Map getOrder(@RequestParam Integer id) {
        return orderService.getOrderById(id);
    }

}
