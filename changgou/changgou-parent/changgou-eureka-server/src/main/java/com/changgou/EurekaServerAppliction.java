package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务器启动类
 *
 * @author Lyle
 * @date 2020/12/25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppliction {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAppliction.class,args);
    }
}
