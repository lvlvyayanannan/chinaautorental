package com.chinaautorental.controller;

/**
 * Created by Administratorand 2019\8\21 0021
 */

import com.chinaautorental.entity.City;
import com.chinaautorental.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

/**
  *@Author:lvyanan on 2019\8\21 0021 11:56
  *@param:
  *@return:
  *@Description:
  */
@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    private CityService cityService;

    //总数
    @RequestMapping("/getCityCountByCityName.htm")
    public Map getCount(String cityName) {
        return cityService.getCountByCityName(cityName);
    }

    //城市信息
    @RequestMapping("/getInfo.htm")
    public Map getInfo(Integer id) throws SQLException {
        return cityService.getCityInfoById(id);
    }

    //插入数据
    @RequestMapping("/insertCity.htm")
    public Map insertCity(City city) {
        return cityService.insertCity(city);
    }

    //修改城市信息
    @RequestMapping("/updateCity.htm")
    public Map updateCity(City city) {
        return cityService.updateCity(city);
    }

    /*删除*/
    @RequestMapping("/deleteCity.htm")
    public Map deleteCity(Integer id) {
        return cityService.deleteCity(id);
    }

    //分页查询
    @RequestMapping("/getListByPage.htm")
    public Map limit(@RequestParam(defaultValue = "1") int PageIndex,
                     @RequestParam(defaultValue = "2") int pageSize,
                     @RequestParam(value = "cityName", required = false) String cityName) {
        Map map = cityService.getCityListByPage(PageIndex, pageSize, cityName);
        System.out.println(map);
        return map;
    }
}