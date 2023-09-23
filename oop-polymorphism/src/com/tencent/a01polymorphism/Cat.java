package com.tencent.a01polymorphism;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public void show(){
        System.out.printf("Cat的名字是%s，人的年龄为%d", getName(), getColor());
    }
    public void catchMouse(){
        System.out.println("catching mouse now!");
    }
    public void eat(String something){
        System.out.printf("%s的%s两只爪子疯狂的挠%s撕碎\n", getColor(),getName(), something);
    }
}
