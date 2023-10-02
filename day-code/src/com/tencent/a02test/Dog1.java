package com.tencent.a02test;

public class Dog1 extends Dog{
    @Override
    public void eat() {
        System.out.printf("dog1 eating, %s %d",getName(),getAge());
    }
}
