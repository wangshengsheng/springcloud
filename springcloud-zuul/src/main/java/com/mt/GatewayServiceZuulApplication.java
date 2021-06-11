package com.mt;

import com.mt.CustomizeFilter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableZuulProxy
@EnableRetry //开启zuul的重试机制
public class GatewayServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceZuulApplication.class, args);
	}

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}
}