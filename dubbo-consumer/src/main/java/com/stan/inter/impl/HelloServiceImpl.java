package com.stan.inter.impl;

import com.stan.service.HelloService;
import com.stan.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    @Autowired
    NameService nameService;

    @Override
    public void sayHello() {
        System.out.println("Rpc准备调用远程服务了...");
        String name = nameService.getName();
        System.out.println("Rpc远程服务调用完成, 结果是: " + name);
    }
}
