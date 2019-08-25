package com.chinaautorental.service.impl;

import com.chinaautorental.dao.VehicleMapper;
import com.chinaautorental.entity.Vehicle;
import com.chinaautorental.service.VehicleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\24 0024
 */
@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {
    @Resource
    private VehicleMapper vehicleMapper;
    //根据车系获得总数
    @Override
    public Map getVehicleCountByDemio(String demio) {
        Integer count=vehicleMapper.getVehicleCountByDemio(demio);
        HashMap<String,Object> map=new HashMap<>();
        if(count!=0){
            map.put("result",true);
            map.put("msg","获取总数成功");
            map.put("data",count);
        }else{
            map.put("result",false);
            map.put("msg","获取总数失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map getVehicleInfoById(Integer id) throws SQLException {
        Map map=new HashMap();
        Vehicle vehicle=vehicleMapper.getVehicleInfoById(id);
        if(vehicle!=null){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",vehicle);
        }else{
            map.put("result",false);
            map.put("mssage","查询失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map getVehicleByPage(int pageIndex, int pageSize, String demio) {
        int index=(pageIndex-1)*pageSize;
        HashMap<String,Object> map=new HashMap<>();
        List<Vehicle> vehicleList=vehicleMapper.selectVehicleByPage(index,pageSize,demio);
        if(vehicleList.size()!=0){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",vehicleList);
        }else{
            map.put("result",false);
            map.put("msg","查询失败");
            map.put("data",0);
        }
        return map;
    }

    @Override
    public Map insetVehicle(Vehicle vehicle) {
        Integer result=vehicleMapper.insertVehicle(vehicle);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result", true);
            map.put("msg", "插入数据成功");
        } else {
            map.put("result", false);
            map.put("message", "插入数据失败");
        }
        return map;
    }

    @Override
    public Map updateVehicle(Vehicle vehicle) {
        Integer result=vehicleMapper.updateVehicle(vehicle);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result", true);
            map.put("msg", "修改数据成功");
        } else {
            map.put("result", false);
            map.put("message", "修改数据失败");
        }
        return map;
    }

    @Override
    public Map deleteVehicle(Integer id) {
        Integer result=vehicleMapper.deleteVehicle(id);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result", true);
            map.put("msg", "删除车辆信息成功");
        } else {
            map.put("result", false);
            map.put("message", "删除车辆信息失败");
        }
        return map;
    }
}
