package com.github.spotsman;

public class BasketballAthlete extends SportsMan{
    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    public BasketballAthlete() {
    }

    @Override
    public void learning() {
        System.out.println("learning basketball");
    }
}
