package com.chinaautorental.controller;

import com.chinaautorental.entity.Vehicle;
import com.chinaautorental.service.VehicleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\24 0024
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController extends BaseController {
    @Resource
    private VehicleService vehicleService;
    //获取总数
    @RequestMapping("/getVehicleCount.htm")
    public Map getVehicleCount(String demio){
        return vehicleService.getVehicleCountByDemio(demio);
    }
    //根据id获取信息
    @RequestMapping("/getInfoById.htm")
    public Map getInfoById(Integer id) throws SQLException {
        return vehicleService.getVehicleInfoById(id);
    }
    //分页查询
    @RequestMapping("/getInfoByPage.htm")
    public Map getInfoByPage(@RequestParam(defaultValue = "1") int pageIndex,
                             @RequestParam(defaultValue = "4") int pageSize,
                             @RequestParam(value = "demio",required = false) String demio){
        Map map=vehicleService.getVehicleByPage(pageIndex,pageSize,demio);
        return map;
    }
    //插入车辆
    @RequestMapping("/insertVehicle.htm")
    public Map insertVehicle(Vehicle vehicle){
        return vehicleService.insetVehicle(vehicle);
    }
    //修改车辆
    @RequestMapping("/updateVehicle.htm")
    public Map updateVehicle(Vehicle vehicle){
        return vehicleService.updateVehicle(vehicle);
    }
    //删除车辆信息
    @RequestMapping("/deleteVehicle.htm")
    public Map deleteVehicle(Integer id){
        return vehicleService.deleteVehicle(id);
    }
}
