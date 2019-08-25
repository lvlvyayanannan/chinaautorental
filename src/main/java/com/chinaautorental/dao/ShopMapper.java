package com.chinaautorental.dao;

import com.chinaautorental.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administratorand 2019\8\23 0023
 */
public interface ShopMapper {
    //根据门店名称获得总数
    public Integer getShopCountByshopName(@Param(value="shopName") String shopName);
    //根据id获得门店信息
    public Shop getShopListById(Integer id)throws SQLException;
    //分页查询
    public List<Shop> getShopListByPage(@Param("index") int index,
                                        @Param("pageSize") int pageSize,
                                        @Param("shopName") String shopName);
    //增加门店信息
    public Integer insertShop(Shop shop);
    //修改门店信息
    public Integer updateShop(Shop shop);
    //删除门店信息
    public Integer deleteShop(Integer id);
}
