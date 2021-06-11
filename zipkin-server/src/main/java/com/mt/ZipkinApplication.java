package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 1.先启动该zipkin-server项目
 * 2.再下载zipkin-server-2.12.9-exec.jar包
 * 3.再执行java -jar /Users/wangshengsheng/Downloads/zipkin-server-2.12.9-exec.jar
 *
 *
 */


@SpringBootApplication
@EnableEurekaClient
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}