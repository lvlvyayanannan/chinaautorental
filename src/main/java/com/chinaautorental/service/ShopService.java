package com.chinaautorental.service;

import com.chinaautorental.entity.Shop;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\23 0023
 */
public interface ShopService {
    //根据门店名称获取总数
    public Map getCountByshopName(String shopName);
    //根据id获取门店信息
    public Map getShopListById(Integer id)throws SQLException;
    //分页查询
    public Map getShopListByPage(int pageIndex,int pageSize,String shopName);
    //增加门店
    public Map insertShop(Shop shop);
    //修改门店信息
    public Map updateShop(Shop shop);
    //删除门店信息
    public Map deleteShop(Integer id);
}
