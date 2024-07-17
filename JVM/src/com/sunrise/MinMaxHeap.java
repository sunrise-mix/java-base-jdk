package com.sunrise;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms and -Xmm.
 *
 * @author zy
 * @since : 1.0 2024/7/15
 **/
public class MinMaxHeap {
    class User{
        public User(String name) {
            this.name = name;
        }
        private String name;
    }
    class Student{
        public Student(String name) {
            this.name = name;
        }
        private String name;
    }
    public static void main(String[] args) throws InterruptedException {
        // loop create object
        System.out.println("loop create object");
        startCreateUser();
        //startCreateStudent();
    }
    public static void startCreateUser(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            User zy = new MinMaxHeap().new User("zy");
            list.add(zy);
        }
    }

    public static void startCreateStudent() throws InterruptedException {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Thread.sleep(500);
            Student zy = new MinMaxHeap().new Student("zy");
            list.add(zy);
        }
    }
}
