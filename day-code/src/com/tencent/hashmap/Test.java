package com.tencent.hashmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String[] s = {"A", "B", "C", "D"};

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            arr.add(s[r.nextInt(s.length)]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        arr.forEach(i -> {
                    if (map.containsKey(i)) {
                        map.put(i, map.get(i) + 1);
                    }
                    else map.put(i, 1);
                }
        );

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}