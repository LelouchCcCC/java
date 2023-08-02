package com.tencent.xitike;
import java.util.Scanner;
public class maiJiPiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input month");
        int mon = sc.nextInt();
        System.out.println("please input cage,head or economy");
        String cage = sc.next();
        System.out.println("please input raw price");
        int price = sc.nextInt();
        switch (mon){
            case 5,6,7,8,9,10->{
                switch (cage){
                    case "head"->{
                        System.out.println(price*0.9);
                    }
                    case "economy"->{
                        System.out.println(price*0.85);
                    }
                    default -> {
                        System.out.println("wrong level");
                    }
                }
            }
            case 1,2,3,4,11,12->{
                switch (cage){
                    case "head"->{
                        System.out.println(price*0.7);
                    }
                    case "economy"->{
                        System.out.println(price*0.65);
                    }
                    default -> {
                        System.out.println("wrong level");
                    }
                }
            }
            default -> {
                System.out.println("wrong month");
            }
        }

    }
}
