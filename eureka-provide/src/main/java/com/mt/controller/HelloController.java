package com.mt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mypath")
public class HelloController {


    /**
     *
     *浏览器访问接口url:http://localhost:9003/hello?name=neo
     *
     */
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name",required=false) String name) {
        return "hello "+name+"，my name is wangshengsheng";
    }



    //http://localhost:8889/foo   通过gateway网关访问  8889是网关服务的端口号
    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }
}