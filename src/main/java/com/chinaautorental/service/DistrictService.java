package com.chinaautorental.service;

/**
 * Created by Administratorand 2019\8\21 0021
 */

import com.chinaautorental.entity.District;

import java.sql.SQLException;
import java.util.Map;

/**
  *@Author:lvyanan on 2019\8\21 0021 15:35
  *@param:
  *@return:
  *@Description:
  */
public interface DistrictService {
    //获取总数
    public Map getCountBydistrictName(String districtName);
    //根据id获取地区信息
    public Map getDistrictInfoById(Integer id) throws SQLException;
    //添加地区
    public Map insertDistrict(District district);
    //修改地区
    public Map updateDistrict(District district);
    //删除地区
    public Map deleteDistrict(Integer id);
    //分页查询
    public Map getDistrictListByPage(int pageIndex,int pageSize,String districtName);
}
