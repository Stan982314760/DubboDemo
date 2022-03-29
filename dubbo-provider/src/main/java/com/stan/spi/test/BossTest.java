package com.stan.spi.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.stan.spi.service.Boss;

/**
 * @Author: stan
 * @Date: 2022/03/29
 * @Description:
 */
public class BossTest {
    public static void main(String[] args) {
        ExtensionLoader<Boss> bossExtensionLoader = ExtensionLoader.getExtensionLoader(Boss.class);
        Boss adaptiveExtension = bossExtensionLoader.getAdaptiveExtension();
        adaptiveExtension.drive(URL.valueOf("localhost://xxxx:8080?boss=myBoss&car=black"));
    }
}
