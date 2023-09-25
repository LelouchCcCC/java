package com.tencent.anonymousClass;

public class Test {
    public static void main(String[] args) {
        start(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("kaishichi");
                    }
                }
        );
        new Animal() {
            @Override
            public void eat() {
                System.out.println("kaishichi");
            }
        }.eat();
    }
    public static void start(Animal a){
        a.eat();
    }
}
