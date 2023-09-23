package com.github.spotsman;

public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void teaching() {
        System.out.println("teaching basketball");
    }
}
