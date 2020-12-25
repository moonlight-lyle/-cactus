package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 商品微服务
 *
 * @author Lyle
 * @date 2020/12/25
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.changgou.goods.dao") //扫描mapper接口
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);
    }
}
