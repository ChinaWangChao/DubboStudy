package com.myaipe.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.myaipe.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class,loadbalance = "ramdon")  //发布为服务必须使用Dubbo
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8081：hello " + name;
    }
}
