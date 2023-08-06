package com.tencent.wordbattle;
public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("张聿涵",100,'男');
        Role r2 = new Role("程西朋",100,'女');
        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O.了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O.了" + r1.getName());
                break;
            }
        }

    }
}
