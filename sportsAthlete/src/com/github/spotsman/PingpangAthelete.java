package com.github.spotsman;

public class PingpangAthelete extends SportsMan implements Speaking{
    public PingpangAthelete(String name, int age) {
        super(name, age);
    }

    public PingpangAthelete() {
    }

    @Override
    public void learning() {
        System.out.println("learning pingpang");
    }

    @Override
    public void speaking() {
        System.out.println("speaking english");
    }
}
