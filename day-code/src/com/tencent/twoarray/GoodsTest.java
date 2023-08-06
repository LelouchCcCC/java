package com.tencent.twoarray;
import java.util.Scanner;
public class GoodsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods[] arr = new Goods[3];
/*        Goods g1 = new Goods(1,"aikexi",3.9,20);
        Goods g2 = new Goods(2,"pfe",5.4,6);
        Goods g3 = new Goods(3,"csjnui",10.4,19);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;*/
        Goods g4 = new Goods();
        int id;
        id = sc.nextInt();
        g4.setId(id);
        String name = sc.next();
        g4.setName(name);
        double price = sc.nextDouble();
        g4.setPrice(price);
        int save = sc.nextInt();
        g4.setSave(save);
        System.out.println(g4.toString());
        Goods g5 = new Goods();
        Goods g6 = new Goods();

    }
}
