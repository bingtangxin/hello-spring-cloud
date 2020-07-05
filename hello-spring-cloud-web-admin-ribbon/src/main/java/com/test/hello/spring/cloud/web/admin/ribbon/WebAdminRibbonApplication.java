package com.test.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 服务消费者（用ribbon来实现服务与服务之间的通信，基于http方式，使用REST API风格进行服务间通信）
 */


//开启熔断器
@EnableHystrix
//@EnableDiscoveryClient注解是将该服务注册到服务发现中心（可以是其他服务发现中心，不仅限于用Eureka作为服务发现中心）
@EnableDiscoveryClient
@SpringBootApplication
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
