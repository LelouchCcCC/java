package com.tencent.a01polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.printf("人的名字是%s，人的年龄为%d", name, age);
    }
    public void keepPat(Animal ani, String something){
        System.out.printf("年龄为%d的%s养了一只%s颜色的%s\n", getAge(), getName(),ani.getColor(),ani.getName());
//        if ani
        ani.eat(something);
    }
}
