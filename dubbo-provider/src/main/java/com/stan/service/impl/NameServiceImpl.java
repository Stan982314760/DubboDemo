package com.stan.service.impl;

import com.stan.service.NameService;

import java.util.UUID;

/**
 * 服务提供者 提供一个人名
 */
public class NameServiceImpl implements NameService {

    @Override
    public String getName() {
        System.out.println("provider invoked...");
        return UUID.randomUUID().toString().substring(0,4);
    }
}
