package com.tyj.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = NacosProviderServiceImpl.class)
public interface NacosProviderService {
    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable("message")String message);
}
