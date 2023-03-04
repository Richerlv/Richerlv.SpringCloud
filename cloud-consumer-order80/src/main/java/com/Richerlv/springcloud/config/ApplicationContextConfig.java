package com.Richerlv.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Richerlv
 * @date: 2023/3/2 23:38
 * @description:
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
//    RestTemlate做负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
