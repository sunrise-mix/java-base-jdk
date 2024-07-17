package com.sunrise.base;

import java.util.concurrent.*;

/**
 * base thread to use.
 *
 * @author yz
 * @since : 1.0 2024/7/16
 **/
public class BaseThreadPoolTest {
    public static void createThreadPoolByExecutor() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("hello world:createThreadPoolByExecutor");
        });
    }

    public static void createThreadPoolByThreadPoolExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(), Thread::new, new ThreadPoolExecutor.DiscardOldestPolicy()
        );
        executor.submit(() -> {
            System.out.println("hello world:createThreadPoolByThreadPoolExecutor");
        });
    }

    public static void main(String[] args) {
        retry:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue retry;
            }
            System.out.println(i);
        }
        retry:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue retry;
            }
            System.out.println(i);
        }
    }
}
