package com.atguigu.springcloud.cfgbeans;

import com.atguigu.myrule.RandomRule_WJ;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //获得Rest时加入Ribbon的配置 -----  Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //覆写ribbon负载均衡算法机制，可选七种出厂默认算法，根据需求
    @Bean
    public IRule myRule() {
        //return new RoundRobinRule();
        //return new RandomRule();//随机算法
        return new RetryRule();
    }
}