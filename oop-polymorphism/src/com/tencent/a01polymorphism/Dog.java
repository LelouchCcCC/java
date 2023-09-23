package com.tencent.a01polymorphism;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public void show(){
        System.out.printf("Dog的名字是%s，人的年龄为%d", getName(), getColor());
    }
    public void lookHome(){
        System.out.println("looking home now~");
    }
    public void eat(String something){
        System.out.printf("%s的%s两只前腿死死的抱住%s猛吃\n", getColor(),getName(), something);
    }
}
