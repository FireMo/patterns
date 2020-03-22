package com.streamTest;

/**
 * @Author: 39218
 * @Description: lambda表达式，匿名内部类，方法引用，单独实现类，
 * @Date: 2020/3/15 10:50
 * @Version: 1.0
 */
//定义函数接口，只有一个抽象方法
interface Animal {
    void whoIyou();
}

public class TestFunction {

    static Animal cat = () -> System.out.println("i am cat");

    public static void zoo(Animal animal) {
        animal.whoIyou();
    }

    public static void main(String[] args) {
        //定义一个函数接口
        zoo(() -> System.out.println("I am dog"));
        zoo(cat);
    }
}
