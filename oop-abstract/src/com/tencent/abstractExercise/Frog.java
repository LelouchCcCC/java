package com.tencent.abstractExercise;

public class Frog extends Animal implements Swimming{
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("eating porms");
    }

    @Override
    public void swimming() {
        System.out.println("frog swimming");
    }
}
