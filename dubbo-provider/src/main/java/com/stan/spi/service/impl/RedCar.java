package com.stan.spi.service.impl;

import com.alibaba.dubbo.common.URL;
import com.stan.spi.service.Car;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: BlackCar
 */
public class RedCar implements Car {

    @Override
    public void run(URL url) {
        System.out.println("red car run...");
    }
}
