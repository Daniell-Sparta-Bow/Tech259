package com.sparta.db.design_patterns.singleton;

public class App {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getSingletonExample();
        SingletonExample singletonExample1 = SingletonExample.getSingletonExample();
        SingletonExample singletonExample2 = SingletonExample.getSingletonExample();
        SingletonExample singletonExample3 = SingletonExample.getSingletonExample();

        System.out.println(singletonExample.hashCode());
        System.out.println(singletonExample1.hashCode());
        System.out.println(singletonExample2.hashCode());
        System.out.println(singletonExample3.hashCode());
    }
}
