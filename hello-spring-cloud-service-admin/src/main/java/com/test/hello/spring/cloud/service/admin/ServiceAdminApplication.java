package com.test.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者
 */

@SpringBootApplication
//@EnableEurekaClient注解是将该服务注册到Eureka服务发现中心（仅限于用Eureka作为服务发现中心的时候才能用此注解）
@EnableEurekaClient
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
