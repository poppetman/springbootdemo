package com.test.controller;

import com.test.pojo.JSONResult;
import com.test.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author huangsongyang
 * @date 2018/7/19 10:20
 */
//@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
//    @ResponseBody
    public User Test(){
        User u = new User();
        u.setName("imooc111");
        u.setAge(8);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        u.setDesc("hhhhhh");
        return u;
    }

    @RequestMapping("/getUserJson")
//    @ResponseBody
    public JSONResult getUserJson(){
        User u = new User();
        u.setName("imooc2111");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc2");
        u.setDesc("hhhhhh111");
        return JSONResult.ok(u);
    }
}
