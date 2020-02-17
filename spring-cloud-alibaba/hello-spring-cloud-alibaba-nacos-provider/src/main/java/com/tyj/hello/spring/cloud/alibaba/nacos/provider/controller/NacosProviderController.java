package com.tyj.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable("message")String message){
        return "hello Nacos " +message;
    }
}
