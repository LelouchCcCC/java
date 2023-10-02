package com.tencent.a02test;

public class Cat2 extends Cat{
    @Override
    public void eat() {
        System.out.printf("cat2 eating, %s %d",getName(),getAge());
    }
}
