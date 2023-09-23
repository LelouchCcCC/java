package com.tencent.abstractExercise;

public class Dog extends Animal implements Swimming{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("eating bones");
    }

    @Override
    public void swimming() {
        System.out.println("dog swmming");
    }
}
