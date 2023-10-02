package com.tencent.a02test;

public abstract class Cat extends Animal{



    public Cat() {
    }
    public Cat(String name,int age) {
        super(name,age);
    }

    public String toString() {
        return "Cat{}";
    }
}
