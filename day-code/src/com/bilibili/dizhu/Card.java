package com.bilibili.dizhu;

import java.util.*;

public class Card {
    static ArrayList<Integer> list= new ArrayList<>();
    static HashMap<Integer, String> map = new HashMap<>();

    static {
        String[] color = {"♣","♠","♦","♥"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int count=1;
        for (String c:number){
            for (String s : color) {
                list.add(count);
                map.put(count++,c+s);
            }
        }
        list.add(count);
        map.put(count++,"大王");
        list.add(count);
        map.put(count,"小王");

    }

    public Card(){
        Collections.shuffle(list);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i<=2){
                lord.add(list.get(i));
                continue;
            }
            if (i%3==0){
                player1.add(list.get(i));
            } else if (i%3==1) {
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
        watchCard("lord", lord);
        watchCard("player1", player1);
        watchCard("player2", player2);
        watchCard("player3", player3);
    }

    public void watchCard(String name, TreeSet<Integer> arr){
        System.out.printf("%s: ",name);
        for (Integer i : arr) {
            System.out.print(map.get(i)+" ");
        }
        System.out.println();
    }
}
