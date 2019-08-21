package com.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 10:46 2019/8/21
 */
@Data           // 添加setter getter 方法 重写toString()
@AllArgsConstructor  // 添加了有参构造
@NoArgsConstructor      // 添加了无参构造
@Component
public class Province {
    private Integer id;     // 省份id
    private String provinceName;        // 省份名称
}
