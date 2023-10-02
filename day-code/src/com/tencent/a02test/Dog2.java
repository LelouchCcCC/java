package com.tencent.a02test;

public class Dog2 extends Dog{
    @Override
    public void eat() {
        System.out.printf("dog2 eating, %s %d",getName(),getAge());

    }
}
