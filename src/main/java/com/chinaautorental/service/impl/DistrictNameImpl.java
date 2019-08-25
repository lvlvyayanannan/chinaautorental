package com.chinaautorental.service.impl;

import com.chinaautorental.dao.DistrictMapper;
import com.chinaautorental.entity.District;
import com.chinaautorental.service.DistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administratorand 2019\8\21 0021
 */
/**
  *@Author:lvyanan on 2019\8\21 0021 15:38
  *@param:
  *@return:
  *@Description:
  */
@Service("districtService")
public class DistrictNameImpl implements DistrictService {
    @Resource
    private DistrictMapper districtMapper;
    @Override
    public Map getCountBydistrictName(String districtName) {
        Integer count=districtMapper.getCountBydistrictName(districtName);
        HashMap<String,Object> map=new HashMap<>();
        if(count>0){
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
    public Map getDistrictInfoById(Integer id) throws SQLException {
        District district=districtMapper.getDistrictInfoById(id);
        Map map=new HashMap();
        if(district!=null){
            map.put("result",true);
            map.put("msg","获取信息成功");
            map.put("data",district);
        }else{
            map.put("result",false);
            map.put("msg","获取信息失败");
            map.put("data",null);
        }
        return map;
    }

    @Override
    public Map insertDistrict(District district) {
        Integer result=districtMapper.insertDistrict(district);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","插入数据成功");
        }else{
            map.put("result",false);
            map.put("msg","插入数据失败");
        }
        return map;
    }

    @Override
    public Map updateDistrict(District district) {
        Integer result=districtMapper.updateDistrict(district);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","地区信息修改成功");
        }else{
            map.put("result",false);
            map.put("msg","地区信息修改失败");
        }
        return map;
    }

    @Override
    public Map deleteDistrict(Integer id) {
        Integer result=districtMapper.deleteDistrict(id);
        HashMap<String,Object> map=new HashMap<>();
        if(result>0){
            map.put("result",true);
            map.put("msg","删除数据成功");
        }else{
            map.put("result",false);
            map.put("msg","删除数据失败");
        }
        return map;
    }

    @Override
    public Map getDistrictListByPage(int pageIndex, int pageSize, String districtName) {
        int index=(pageIndex-1)*pageSize;
        HashMap<String,Object> map=new HashMap<>();
        List<District> districtList=districtMapper.selectDistrictByPage(index,pageSize,districtName);
        if(districtList.size()!=0){
            map.put("result",true);
            map.put("msg","查询成功");
            map.put("data",districtList);
        }else{
            map.put("result",false);
            map.put("msg","查询失败");
            map.put("data",null);
        }
        return map;
    }

}
