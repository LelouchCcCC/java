package com.github.spotsman;

public abstract class Coach extends Person{
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }
    public abstract void teaching();
}
