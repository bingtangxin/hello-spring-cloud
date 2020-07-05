package com.test.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.test.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;


//熔断类，每个方法都有对应的熔断方法
@Component
public class AdminServiceHystrix implements AdminService {


    @Override
    public String sayHello(String message4) {
        return String.format("Hello!your message is %s but request bad",message4);
    }
}
