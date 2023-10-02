package com.tencent.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"qw");
        map.put(2,"qwde");
        map.put(3,"qwfe");
        System.out.println(map);

        map.keySet().forEach(i-> System.out.println(map.get(i)));
        Iterator<Integer> itor = map.keySet().iterator();
        while (itor.hasNext()){
            System.out.println(map.get(itor.next()));
        }
        System.out.println("=--------------=");
        map.forEach((i,j)-> System.out.println(j));


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
