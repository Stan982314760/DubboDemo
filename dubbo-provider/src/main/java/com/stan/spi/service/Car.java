package com.stan.spi.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: Car
 */
@SPI
public interface Car {

    @Adaptive
    void run(URL url);
}
