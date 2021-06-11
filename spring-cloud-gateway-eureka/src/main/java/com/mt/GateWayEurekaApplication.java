package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


/**
 *
 *
 * 将 Spring Cloud Gateway 注册到服务中心之后，网关会自动代理所有的在注册中心的服务，访问这些服务的语法为：
 * http://网关地址：端口/服务中心注册 serviceId/具体的url
 *
 * 浏览器访问接口url:http://localhost:8889/SPRING-CLOUD-PRODUCER/hello?name=neo
 *
 */
@SpringBootApplication
public class GateWayEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayEurekaApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("path_route", r -> r.path("/about")
						.uri("http://ityouknow.com"))
				.build();
	}

}