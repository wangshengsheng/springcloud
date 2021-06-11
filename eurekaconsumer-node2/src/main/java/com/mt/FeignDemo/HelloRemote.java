package com.mt.FeignDemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * name:远程服务名，及spring.application.name配置的名称
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致
 */
//@FeignClient(name= "spring-cloud-producer")
@FeignClient(name= "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}