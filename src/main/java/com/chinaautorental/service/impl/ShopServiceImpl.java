package com.chinaautorental.service.impl;

import com.chinaautorental.dao.ShopMapper;
import com.chinaautorental.entity.Shop;
import com.chinaautorental.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\23 0023
 */
@Service("/shopService")
public class ShopServiceImpl implements ShopService {
    @Resource
    public ShopMapper shopMapper;
    //获取总数
    @Override
    public Map getCountByshopName(String shopName) {
        Integer count=shopMapper.getShopCountByshopName(shopName);
        HashMap<String,Object> map=new HashMap<>();
        if(count>0){
            map.put("result",true);
            map.put("msg","获得总数成功");
            map.put("data",count);
        }else{
            map.put("result",false);
            map.put("msg","获得总数失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map getShopListById(Integer id) throws SQLException {
        Map map=new HashMap();
        Shop shop=shopMapper.getShopListById(id);
        if(shop!=null){
            map.put("result",true);
            map.put("msg","获取信息成功");
            map.put("data",shop);
        }else{
            map.put("result",false);
            map.put("mesg","获取信息失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map getShopListByPage(int pageIndex, int pageSize, String shopName) {
        int index=(pageIndex-1)*pageSize;
        HashMap<String,Object> map=new HashMap<>();
        List<Shop> shopList=shopMapper.getShopListByPage(index,pageSize,shopName);
        if(shopList.size()!=0){
            map.put("result",true);
            map.put("msg","分页查询成功");
            map.put("data",shopList);
        }else{
            map.put("result",false);
            map.put("msg","分页查询失败");
            map.put("data",shopList);
        }
        return map;
    }

    @Override
    public Map insertShop(Shop shop) {
        HashMap<String,Object> map=new HashMap<>();
        Integer result=shopMapper.insertShop(shop);
        if(result>0){
            map.put("result",true);
            map.put("msg","插入成功");
        }else{
            map.put("result",false);
            map.put("msg","插入失败");
        }
        return map;
    }

    @Override
    public Map updateShop(Shop shop) {
        HashMap<String,Object> map=new HashMap<>();
        Integer result=shopMapper.updateShop(shop);
        if(result>0){
            map.put("result",true);
            map.put("msg","修改门店信息成功");
        }else{
            map.put("result",false);
            map.put("msg","修改门店信息失败");
        }
        return map;
    }

    @Override
    public Map deleteShop(Integer id) {
        Integer result=shopMapper.deleteShop(id);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","删除成功");
        }else{
            map.put("result",false);
            map.put("msg","删除失败");
        }
        return map;
    }

}
