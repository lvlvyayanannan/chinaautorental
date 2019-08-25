package com.chinaautorental.controller;

import com.chinaautorental.entity.District;
import com.chinaautorental.service.DistrictService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\21 0021
 */
@RestController
@RequestMapping("/district")
public class DistrictController {
    @Resource
    private DistrictService districtService;
    //获取总数
    @RequestMapping("/getCountBydistrictName.htm")
    public Map getCount(String districtName){
        return districtService.getCountBydistrictName(districtName);
    }
    //获取信息
    @RequestMapping("/getInfoById.htm")
    public Map getInfo(Integer id) throws SQLException {
        return districtService.getDistrictInfoById(id);
    }
    //插入信息
    @RequestMapping("/insertDistrict.htm")
    public Map insertDistrict(District district){
        return districtService.insertDistrict(district);
    }
    //修改地区信息
    @RequestMapping("/updateDistrict.htm")
    public Map updateDistrict(District district){
        return districtService.updateDistrict(district);
    }
    //删除地区信息
    @RequestMapping("/deleteDistrict.htm")
    public Map deleteDistrict(Integer id){
        return districtService.deleteDistrict(id);
    }
    //分页查询
    @RequestMapping("/getDistrictByPage.htm")
    public Map getDistrictByPage(@RequestParam(defaultValue = "1") int pageIndex,
                                 @RequestParam(defaultValue ="2")int pageSize,
                                 @RequestParam(value = "districtName",required = false) String districtName){
        Map map=districtService.getDistrictListByPage(pageIndex,pageSize,districtName);
        return map;
    }
}
