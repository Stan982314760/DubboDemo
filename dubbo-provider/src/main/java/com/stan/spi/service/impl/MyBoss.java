package com.stan.spi.service.impl;

import com.alibaba.dubbo.common.URL;
import com.stan.spi.service.Boss;
import com.stan.spi.service.Car;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: MyBoss
 */
public class MyBoss implements Boss {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public void drive(URL url) {
        car.run(url);
    }
}
