package com.tencent.a01polymorphism;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setColor("Yellow");
        dog.setName("Zyh");
        Cat cat = new Cat();
        cat.setColor("Black");
        cat.setName("Ylc");
        dog.lookHome();
        cat.catchMouse();
        Person p = new Person();
        p.setAge(10);
        p.setName("nvolrhv");
        p.keepPat(dog,"what");
        p.keepPat(cat,"whatto");
    }
    public static void register(Person p){
        p.show();
    }
}
