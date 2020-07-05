package com.test.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixDashboardConfiguration {


    /**
     *
     * 默认情况下，使用 @Bean声明一个bean，bean的名称由方法名决定。此外，可以通过@Bean注解里面的name属性主动设置bean的名称。
     * 此处生成的bean不需要在其他地方获取使用，只需要让其初始化生成一个servlet即可，所以bean的名字无所谓，后面不需要获取该bean
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
