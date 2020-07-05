package com.test.hello.spring.cloud.web.admin.feign.service;


import com.test.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign相当于一个中间代理人，想要与别的服务进行通信就得通过feign来传递请求，
 * 通过feign来指定需要通信的服务名称，然后设置需要通信的服务接口地址
 */

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)//fallback属性设置熔断类
public interface AdminService {



    @RequestMapping(value = "hello2",method = RequestMethod.GET)
    /*这里方法参数中的@RequestParam注解跟其他地方的@RequestParam不一样，其他地方是获取参数，
        在这里是设置参数，设置之后，请求hello-spring-cloud-service-admin服务的/hello2接口时就会携带该参数，
        从而hello-spring-cloud-service-admin服务就能用@RequestParam获取到这个参数，
        @RequestParam的value值就是请求时携带的参数的Key值
     */
    public String sayHello(@RequestParam String message4);//就算该方法中的参数名与hello-spring-cloud-service-admin服务的/hello2接口对应的方法中的参数名一致，也要写上@RequestParam注解，否则会报错
}
