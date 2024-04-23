package com.sparta.db.design_patterns.singleton;

public class SingletonExample {
    private static final SingletonExample singletonExample = new SingletonExample();
    private SingletonExample() {}

    public static SingletonExample getSingletonExample(){
//        if (singletonExample == null){
//            singletonExample = new SingletonExample(); // Non-final version
//        }
        return singletonExample;
    }
}
