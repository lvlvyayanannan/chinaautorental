package com.chinaautorental.test;

import com.chinaautorental.entity.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 9:52 2019/8/15
 */
public class Test {
    @org.junit.Test
    public void test() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");//可以方便地修改日期格式
        String hehe = dateFormat.format( now );

        System.out.println(Integer.parseInt(hehe));
    }

    // 随机数测试
    @org.junit.Test
    public void test01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse("2019-11-22 00:00:00");
            Date date1 = sdf.parse("2019-11-22 00:00:10");
            Order order = new Order();
            Order order1 = new Order();
            order.setPickTime(date);
            order1.setPickTime(date1);
            System.out.println(order.getPickTime().toString());
            System.out.println(order1.getPickTime().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
