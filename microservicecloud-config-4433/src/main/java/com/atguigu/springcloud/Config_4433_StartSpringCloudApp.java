package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// 主启动类
@SpringBootApplication
@EnableConfigServer
public class Config_4433_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_4433_StartSpringCloudApp.class, args);
    }

}
