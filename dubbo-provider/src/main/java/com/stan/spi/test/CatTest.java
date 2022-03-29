package com.stan.spi.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.stan.spi.service.Car;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description: CatTest
 */
public class CatTest {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car adaptiveExtension = extensionLoader.getAdaptiveExtension();
        adaptiveExtension.run(URL.valueOf("localhost://xxxx:8080?car=red"));
        adaptiveExtension.run(URL.valueOf("localhost://xxxx:8080?car=black"));
    }
}
