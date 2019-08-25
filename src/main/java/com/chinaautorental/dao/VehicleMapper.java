package com.chinaautorental.dao;

import com.chinaautorental.entity.Vehicle;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administratorand 2019\8\24 0024
 */
public interface VehicleMapper {
    //根据车系查询总数
    public Integer getVehicleCountByDemio(@Param("demio") String demio);
    //根据id获取车辆信息
    public Vehicle getVehicleInfoById(Integer id) throws SQLException;
    //分页查询
    public List<Vehicle> selectVehicleByPage(@Param("index") int index,
                                             @Param("pageSize") int pageSize,
                                             @Param("demio") String demio);
    //增加车辆
    public Integer insertVehicle(Vehicle vehicle);
    //修改车辆信息
    public Integer updateVehicle(Vehicle vehicle);
    //删除车辆信息
    public Integer deleteVehicle(Integer id);
}
