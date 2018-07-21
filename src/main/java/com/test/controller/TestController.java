package com.test.controller;

import com.test.pojo.JSONResult;
import com.test.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangsongyang
 * @date 2018/7/19 10:20
 */
@RestController
public class TestController {

    @Autowired
    private Resource resource;

    @RequestMapping("/test")
    public String Test(){
        return "hahhhhhh";
    }

    @RequestMapping("/getResource")
    public JSONResult getResource(){
        Resource bean = new Resource();
        // 把resource的属性赋给新建的类bean
        BeanUtils.copyProperties(resource,bean);

        return JSONResult.ok(bean);
    }
}
