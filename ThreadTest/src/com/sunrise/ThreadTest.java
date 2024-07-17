package com.sunrise;

import java.util.concurrent.*;

/**
 * thread test.
 *
 * @author yz
 * @since : 1.0 2024/7/12
 **/
public class ThreadTest {
    //获取当前设备
    private static final int processors = Runtime.getRuntime().availableProcessors();
    private static volatile int count = 0;
    private static int maxCount = 1000_000;

    // io 密集型测试
    public static void ioTest(ExecutorService executor) {
        System.out.println("start ioTest:" + maxCount);
        Runnable runnable = () -> {
            System.out.println("maxCount:" + maxCount);
            synchronized ("ThreadTest.ioTest") {
                if (count < maxCount) {
                    count++;
                    System.out.println("add: " + count);
                }
            }
        };
        for (int i = 0; i < maxCount; i++) {
            executor.submit(runnable);
        }
        System.out.println("end ioTest:" + maxCount);
    }

    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executorOne = Executors.newFixedThreadPool(processors);
        ExecutorService executorDouble = Executors.newFixedThreadPool(processors * 2);
        ExecutorService executorTenFold = Executors.newFixedThreadPool(processors * 10);
        ExecutorService executorHundredFold = Executors.newFixedThreadPool(processors * 100);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>()
                , new ThreadPoolExecutor.DiscardOldestPolicy()
        );
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        long completedTaskCount = executor.getCompletedTaskCount();
        long startTime = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime);
        ioTest(executorOne);
        while (count < maxCount) {
            //System.out.println(count);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("截止时间：" + endTime + "ms" + " 耗时：" + (endTime - startTime) / 1000 + "s");
        ThreadGroup threadGroup = new ThreadGroup("helo");
    }
}
