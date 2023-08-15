package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2021/7/7
 * Author:ybc
 * Description:
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success(){
        /*这里没有加上forward:开头是因为解析器是【InternalResourceViewResolver】*/
        return "success";
    }

}