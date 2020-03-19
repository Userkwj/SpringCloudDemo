package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule { //自定义负载均衡算法规则

    @Bean
    public IRule myRule() {
//        return new RandomRule();//Ribbon默认是轮询,我自定义为随机
        return new RandomRule_WJ();//自定义每台机器调用五次/自定义算法
    }

}
