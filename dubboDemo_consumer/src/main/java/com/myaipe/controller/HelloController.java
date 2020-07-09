package com.myaipe.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myaipe.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @Reference //查找服务
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
