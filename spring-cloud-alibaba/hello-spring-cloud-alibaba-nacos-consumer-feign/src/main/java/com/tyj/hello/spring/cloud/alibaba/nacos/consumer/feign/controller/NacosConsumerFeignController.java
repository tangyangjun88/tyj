package com.tyj.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.tyj.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerFeignController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/")
    public String echoAppName(){
        return nacosProviderService.echo(appName);
    }
}
