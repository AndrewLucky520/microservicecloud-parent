package com.itcast.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Alicyu
 * @classname DeptConsumer80_App
 * @description TODO
 * @date 2019/9/4 20:40
 */
/*官方文档明确给出了警告：
        这个自定义配置类MySelfRule不能放在@ComponentScan所扫描的当前包下以及子包下，
        否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
        我们达不到特殊化定制的目的了*/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_App.class, args);
    }

}
