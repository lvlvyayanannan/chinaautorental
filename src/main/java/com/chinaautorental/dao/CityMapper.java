package com.chinaautorental.dao;

/**
 * Created by Administratorand 2019\8\21 0021
 */

import com.chinaautorental.entity.City;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
  *@Author:lvyanan on 2019\8\21 0021 11:28
  *@param:
  *@return:
  *@Description:
  */
public interface CityMapper {
    //根据城市名获取总数
    public Integer  getCityCountByCityName(@Param("cityName") String cityName);
    //根据id获取城市姓名
    public City getCityInfoById(Integer id) throws SQLException;
    //增加城市
    public Integer insertCity(City city);
    //修改城市信息
    public Integer updateCity(City city);
    //删除城市名
    public Integer deleteCity(Integer id);
    //分页查询
    public List<City> selectCityByPage(@Param("index") int index,
                                       @Param("pageSize") int pageSize,
                                       @Param("cityName") String cityName);
}
