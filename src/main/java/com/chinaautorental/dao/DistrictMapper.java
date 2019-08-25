package com.chinaautorental.dao;

/**
 * Created by Administratorand 2019\8\21 0021
 */

import com.chinaautorental.entity.District;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
  *@Author:lvyanan on 2019\8\21 0021 15:20
  *@param:
  *@return:
  *@Description:
  */
public interface DistrictMapper {
    //根据地区名称获得总数
    public Integer getCountBydistrictName(@Param("districtName") String district);
    //根据id获取地区信息
    public District getDistrictInfoById(Integer id) throws SQLException;
    //添加地区名称
    public Integer insertDistrict(District district);
    //修改地区信息
    public Integer updateDistrict(District district);
    //删除地区信息
    public Integer deleteDistrict(Integer id);
    //分页查询
    public List<District>selectDistrictByPage(@Param("index") int index,
                                              @Param("pageSize") int pageSize,
                                              @Param("districtName") String districtName);
}
