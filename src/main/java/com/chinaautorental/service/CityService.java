package com.chinaautorental.service;

import com.chinaautorental.entity.City;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\21 0021
 */
/**
  *@Author:lvyanan on 2019\8\21 0021 11:33
  *@param:
  *@return:
  *@Description:
  */
public interface CityService {
    //获取总数
    public Map getCountByCityName (String cityName);
    //获取城市信息
    public Map getCityInfoById(Integer id) throws SQLException;
    //增加城市信息
    public Map insertCity(City city);
    //修改城市信息
    public Map updateCity(City city);
    //删除城市
    public Map deleteCity(Integer id);
    //分页查询
    public Map getCityListByPage(int PageIndex,int pageSize,String cityName);
}
