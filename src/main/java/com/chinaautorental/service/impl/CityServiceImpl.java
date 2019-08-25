package com.chinaautorental.service.impl;

import com.chinaautorental.dao.CityMapper;
import com.chinaautorental.entity.City;
import com.chinaautorental.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\21 0021
 */
/**
  *@Author:lvyanan on 2019\8\21 0021 11:36
  *@param:
  *@return:
  *@Description:
  */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;
    //获取总数
    @Override
    public Map getCountByCityName(String cityName) {
        Integer count=cityMapper.getCityCountByCityName(cityName);
        HashMap<String,Object> map=new HashMap<>();
        if(count!=0){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",count);
        }else{
            map.put("result",false);
            map.put("msg","查询失败");
        }
        return map;
    }

    @Override
    public Map getCityInfoById(Integer id) throws SQLException {
        Map map=new HashMap();
        City city=cityMapper.getCityInfoById(id);
        if(city!=null){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",city);
        }else{
            map.put("result",false);
            map.put("msg","查询失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map insertCity(City city) {
        Integer result=cityMapper.insertCity(city);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","添加成功");
        }else{
            map.put("result",false);
            map.put("msg","插入数据失败");
        }
        return map;
    }

    @Override
    public Map updateCity(City city) {
        Integer result=cityMapper.updateCity(city);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","修改数据成功");
        }else{
            map.put("result",false);
            map.put("msg","修改数据失败");
        }
        return map;
    }

    @Override
    public Map deleteCity(Integer id) {
        Integer result=cityMapper.deleteCity(id);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","删除城市成功");
        }else{
            map.put("result",false);
            map.put("msg","删除失败");
        }
        return map;
    }
    //分页
    @Override
    public Map getCityListByPage(int PageIndex, int pageSize, String cityName) {
        int index=(PageIndex-1)*pageSize;
        HashMap<String,Object> map=new HashMap<>();
        List<City> cityList=cityMapper.selectCityByPage(index,pageSize,cityName);
        if(cityList.size()!=0){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",cityList);
        }else{
            map.put("result",false);
            map.put("msg","查询失败");
            map.put("data",null);
        }
        return map;
    }


}
