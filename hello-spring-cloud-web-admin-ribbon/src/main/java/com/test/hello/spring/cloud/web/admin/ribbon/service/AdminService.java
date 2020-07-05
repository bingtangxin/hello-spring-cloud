package com.test.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    //设置当触发熔断时的回调方法
    @HystrixCommand(fallbackMethod = "sayError")
    public String sayHello(String message) {
        System.out.println("ggggggg");
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hello?message=" + message, String.class);
    }


    //熔断后具体执行的回调方法
    public String sayError(String message) {
        System.out.println("fffffff");
        return String.format("Hello!your message is %s but request bad", message);
    }
}
