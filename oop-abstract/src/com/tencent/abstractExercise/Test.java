package com.tencent.abstractExercise;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("f", 10);
        Dog d = new Dog("d", 9);
        Rabbit r = new Rabbit("r", 5);
        f.swimming();
        f.eat();
        d.swimming();
        d.eat();
        r.eat();
    }
}
