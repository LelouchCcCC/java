package com.tencent.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("nfo");
        li.add("nfbfbo");
        li.add("nfbfrtho");
        li.add("nfrhtrbfo");
        li.add("nbbffo");
        li.add("nftbo");
        li.add("nfhy5thto");
        Iterator<String> itor = li.iterator();
//        while (itor.hasNext()){
//            String nxt=itor.next();
//            System.out.println(nxt);
//        }
        ListIterator<String> ss = li.listIterator(7);
        while (ss.hasPrevious()){
            System.out.println(ss.previous());
        }
    }
}
