package com.tencent.demo1;

public class switch6 {
    public static void main(String[] args) {
        int i = 12;
        switch (i) {
            case 1 -> {
                System.out.println("ndio");
            }
            case 2->{
                System.out.println("cn");
            }
            case 10->{
                System.out.println("10");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
    }
}
