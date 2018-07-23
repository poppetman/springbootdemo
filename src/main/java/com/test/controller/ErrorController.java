package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangsongyang
 * @date 2018/7/23 20:09
 */
@Controller
@RequestMapping("/err")
public class ErrorController {

    @RequestMapping("/error")
    public void error(){
        int a = 1 / 0;
    }
}
