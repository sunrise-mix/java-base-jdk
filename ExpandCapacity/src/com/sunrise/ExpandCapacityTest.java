package com.sunrise;

import java.util.ArrayList;
import java.util.List;

/**
 * expand capacity test.
 *
 * @author yz
 * @since : 1.0 2024/7/18
 **/
public class ExpandCapacityTest {
    public static void main(String[] args) {
        listExpandCapacity();
    }

    public static void listExpandCapacity() {
        System.out.println("list expand capacity test");
        long start = System.currentTimeMillis();
        long lastTime = start;
        List<User> list = new ArrayList<>(1);
        for (int i = 0; i < 1000000; i++) {
            list.add(new User("listExpandCapacity" + i, i));
            System.out.println(System.currentTimeMillis() - lastTime);
            lastTime = System.currentTimeMillis();
        }
        System.out.println("list expand capacity time:" + (System.currentTimeMillis() - start) + "ms" + list.size());
    }

    static class User {
        String name;
        Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
