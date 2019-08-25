package com.chinaautorental.service;

import com.chinaautorental.entity.Vehicle;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\24 0024
 */
public interface VehicleService {
    //根据车系 获取总数
    public Map getVehicleCountByDemio(String demio);
    //根据id获取车辆信息
    public Map getVehicleInfoById(Integer id)throws SQLException;
    //分页查询
    public Map getVehicleByPage(int pageIndex,int pageSize,String denio);
    //增加车辆信息
    public Map insetVehicle(Vehicle vehicle);
    //修改车辆信息
    public Map updateVehicle(Vehicle vehicle);
    //删除车辆信息
    public Map deleteVehicle(Integer id);
}
