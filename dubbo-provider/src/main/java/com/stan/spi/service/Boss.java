package com.stan.spi.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: Boss
 */
@SPI
public interface Boss {

    @Adaptive
    void drive(URL url);
}
