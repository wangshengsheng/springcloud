package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * 浏览器访问地址：curl -X POST http://localhost:8012/actuator/refresh
 * 访问的作用是让config-server中在git修改的配置生效，客户端可以看到最新的配置
 *
 *
 * 总线事件传播 参考链接：https://blog.csdn.net/panchang199266/article/details/84640713
 *
 * 单点传播：
 * 浏览器访问以下链接可以让集群里的某一台或某几台服务器立即获取服务端的最新配置，而其他的服务器没有获取最新的配置
 * curl -X POST http://localhost:8012/actuator/bus-refresh/spring-cloud-config-client:8012
 *
 * 集群传播：
 * curl -X POST http://localhost:8012/actuator/bus-refresh/spring-cloud-config-client:**
 *
 */


@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
