package com.chinaautorental.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: BaseController
 * @Author: 吕亚楠
 * @CreateDate: 2019/7/15 20:13
 */

public class BaseController {
    /**
     * 使用@InitBinder 解决SpringMVC日期类型无法绑定的问题
     * @param dataBinder
     */

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
}
