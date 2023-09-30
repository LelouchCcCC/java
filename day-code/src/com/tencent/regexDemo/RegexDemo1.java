package com.tencent.regexDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) throws ParseException {
        String s = "Javavkvmiro,cnef,jneJAva45,fmieofi. Java20";
        Pattern p = Pattern.compile("((?i)Java)(?!20|45)");
        Matcher m =p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
        Date d = new Date();
        System.out.println(d);
        Date d1 = new Date(0);
        long time = d1.getTime();
        time+=1000L*60*60*24*365;
        d1.setTime(time);
        System.out.println(d1);
//        extracted(s);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日");
        String st="2000年11月11日";
        Date pp= sd.parse(st);
//        pp
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
        String ssss = sd2.format(pp);
        System.out.println(ssss);
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int x = Integer.parseInt(line);
        System.out.println(x);
    }

    private static void extracted(String s) {
        Pattern p = Pattern.compile("Java(?=45|20)");
        Matcher m = p.matcher(s);

        boolean b = m.find();
        System.out.println(b);
        String group = m.group();
        System.out.println(group);
        b=m.find();
        group = m.group();
        System.out.println(group);
    }
}
