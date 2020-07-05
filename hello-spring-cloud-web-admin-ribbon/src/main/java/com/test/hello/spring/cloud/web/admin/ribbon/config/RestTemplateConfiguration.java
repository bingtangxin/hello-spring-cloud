package com.test.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    //@LoadBalanced注解的意思是以负载均衡的方式去访问服务提供者(当前案例就是，以负载均衡的方式去访问ServiceAdminApplication)
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
