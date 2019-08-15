package com.chinaautorental.test;

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
        System.out.println(hehe);
    }
}
