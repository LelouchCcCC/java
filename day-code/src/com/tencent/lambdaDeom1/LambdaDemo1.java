package com.tencent.lambdaDeom1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        swim(()->{
            System.out.println("----");
        });
    }
    public static void swim(Swim s){
        s.swimming();
    }

}
interface Swim {
    public abstract void swimming();
}
