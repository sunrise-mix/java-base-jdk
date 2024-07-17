package com.sunrise;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * volatile test.
 *
 * @author yz
 * @since : 1.0 2024/7/12
 **/
public class VolatileTest {
    private static volatile int count = 0;

    public static void main(String[] args) {
        //获取当前设备
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        //定义时间测算

        //定义多线程
        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        count++;
        System.out.println(count);
    }
}
