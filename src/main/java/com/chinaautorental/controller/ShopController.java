package com.chinaautorental.controller;

import com.chinaautorental.entity.Shop;
import com.chinaautorental.service.ShopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\23 0023
 */
@RestController
@RequestMapping("/shop")
public class ShopController extends BaseController{
    @Resource
    private ShopService shopService;
    //获取总数
    @RequestMapping("/getCount.htm")
    public Map  getCountByshopName(String shopName){
        return shopService.getCountByshopName(shopName);
    }
    //根据id获取信息
    @RequestMapping("/getInfoById.htm")
    public Map getShopListById(Integer id) throws SQLException {
        return shopService.getShopListById(id);
    }
    //分页查询
    @RequestMapping("/getShopListByPage.htm")
    public Map limit(@RequestParam(defaultValue = "1") int pageIndex,
                     @RequestParam(defaultValue = "3") int pageSize,
                     @RequestParam(value = "shopName",required = false) String shopName){
        Map map=shopService.getShopListByPage(pageIndex,pageSize,shopName);
        return map;
    }
    //增加门店信息
    @RequestMapping("/insertShop.htm")
    public Map insetShop(Shop shop){
        return shopService.insertShop(shop);
    }
    //修改门店信息
    @RequestMapping("/updateShop.htm")
    public Map updateShop(Shop shop){
        return shopService.updateShop(shop);
    }
    //删除门店
    @RequestMapping("/deleteShop.htm")
    public Map deleteShop(Integer id){
        return shopService.deleteShop(id);
    }
}
