package com.tencent.a02test;

public class Cat1 extends Cat{
    public Cat1() {
    }
    public Cat1(String name,int age) {
        super(name,age);
    }


    @Override
    public void eat() {
        System.out.printf("cat1 eating, %s %d",getName(),getAge());
    }
}
