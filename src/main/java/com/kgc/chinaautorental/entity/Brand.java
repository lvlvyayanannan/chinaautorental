package com.kgc.chinaautorental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: LiKai
 * @Description:
 * @Date: Create in 22:07 2019/8/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Brand implements Serializable {
    private Integer id;
    private String brandName;
}
