package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program:microservicecloud-parent
 * @Description:
 * @Author: kaiqiang_qin
 * @Date: 2019-09-29 15:39:58
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进eureka服务中
public class Deptprovider8001_App {

    public static void main(String[] args) {

        SpringApplication.run(Deptprovider8001_App.class,args);
    }
}
