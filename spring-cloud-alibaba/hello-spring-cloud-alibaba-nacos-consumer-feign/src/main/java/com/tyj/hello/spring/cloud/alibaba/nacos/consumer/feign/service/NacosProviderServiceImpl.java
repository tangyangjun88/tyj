package com.tyj.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.stereotype.Component;

@Component
public class NacosProviderServiceImpl implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "您的网络出现了问题！请稍后重试！";
    }
}
