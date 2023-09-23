package com.github.spotsman;

public class PingpangCoach extends Coach implements Speaking{
    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    public PingpangCoach() {
    }

    @Override
    public void teaching() {
        System.out.println("teaching Pingpang");
    }

//    @Override
//    public void speaking() {
//        System.out.println("speaking English");
//    }
}
