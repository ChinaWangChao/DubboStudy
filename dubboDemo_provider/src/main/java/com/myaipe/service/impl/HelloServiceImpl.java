package com.myaipe.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myaipe.service.HelloService;

@Service  //发布为服务必须使用Dubbo
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
