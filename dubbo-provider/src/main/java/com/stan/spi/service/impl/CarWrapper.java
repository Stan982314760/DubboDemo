package com.stan.spi.service.impl;

import com.alibaba.dubbo.common.URL;
import com.stan.spi.service.Car;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: CarWrapper
 */
public class CarWrapper implements Car {

    private final Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }


    @Override
    public void run(URL url) {
        System.out.println("car wrapper...");
        car.run(url);
    }
}
