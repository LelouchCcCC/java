package com.tencent.neiWai;

public class Car {
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car() {
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println();
//        Engine e = new Engine(14,"mei");
//        e.show();

    }

    public class Engine{
        private int age;
        private String brand;

        public Engine() {
        }

        public Engine(int age, String brand) {
            this.age = age;
            this.brand = brand;
        }

        public void show(){
            System.out.println(age);
            System.out.println(Car.this.age);
            System.out.println(brand);
            System.out.println(name);
            System.out.println();
            System.out.println("----");
            Car.this.show();
        }
    }
    public Engine getInstance(){
        return new Engine();
    }
    public Engine getInstance(int age, String brand){
        return new Engine(age,brand);
    }
}
