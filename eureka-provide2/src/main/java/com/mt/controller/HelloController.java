package com.mt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangshengsheng02
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name",required=false) String name) {
        return "hello "+name+"，my name is wangshengsheng2";
    }


    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!!";
    }

    /**
     *
     * 测试zuul的重试机制
     *
     * 有时候因为网络或者其它原因，服务可能会暂时的不可用，
     * 这个时候我们希望可以再次对服务进行重试，Zuul也帮我们实现了此功能，
     * 需要结合Spring Retry 一起来实现。下面我们以上面的项目为例做演示。
     * @param name
     * @return
     */
//    @RequestMapping("/hello")
//    public String hello(@RequestParam String name) {
//        logger.info("request two name is "+name);
//        try{
//            Thread.sleep(1000000);
//        }catch ( Exception e){
//            logger.error(" hello two error",e);
//        }
//        return "hello "+name+"，this is two messge";
//    }
}