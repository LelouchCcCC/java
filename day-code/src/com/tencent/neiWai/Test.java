package com.tencent.neiWai;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("f",10);
//        c.show();
//        Car.Engine e = new Car().new Engine();
//        Car.Engine
        Car.Engine p = c.getInstance(14,"rosles");

        p.show();
    }
}
