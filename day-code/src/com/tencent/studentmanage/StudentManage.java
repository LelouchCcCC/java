package com.tencent.studentmanage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class StudentManage {
    public static void main(String[] args) {
        System.out.println("欢迎来到学生管理系统");
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangyu", "lelouch123", 1,123456);
        Student s2 = new Student("zhangyu2", "lelouch1234", 2,123456);
        Student s3 = new Student("zhangyu3", "lelouch1235", 3,123456);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            String choice = sc.next();
            switch (choice) {
                case "1"-> login(list);
                case "2"-> register(list);
                case "3"-> forgetPass(list);
                case "4"-> System.exit(0);
                default -> System.out.println("???");
            }
        }

    }

    public static void login(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the name:");
        String name = sc.next();
        System.out.println("please input the passwd:");
        String passwd = sc.next();
        String aicode = generateCode();
        System.out.printf("the code is %s, please input the code:\n", aicode);
        String code = sc.next();
        if (!judgeName(list, name)) {
            System.out.println("Name not found, please register first!");
            return;
        }
        while (!code.equals(aicode)) {
            System.out.println("code is wrong, please input it again!");
            code = sc.next();
        }
        for (int i = 0; i < 3; i++) {
            if (judgeNamePasswd(name, passwd, list)) {
                break;
            } else {
                if (i < 2) {
                    System.out.println("wrong password, please input the passwd:");
                    passwd = sc.next();
                } else {
                    System.out.println("wrong password for 3 times! you are out!");
                    return;
                }
            }
        }
        System.out.println("login successfully!");

    }

    public static void register(ArrayList<Student> list) {
        System.out.println("please input your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

    }

    public static void forgetPass(ArrayList<Student> list) {
    }

    public static boolean judgeName(ArrayList<Student> list, String name) {
        for (Student student : list) {
            if (name.equals(student.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String generateCode() {
        Random rd = new Random();
        int pos = rd.nextInt(5);
        String str = "";
        for (int i = 0; i < 5; i++) {
            if (i == pos) {
                str += generateOneNumber();
            } else {
                str += generateOneLetter();
            }
        }
        return str;
    }

    public static char generateOneLetter() {
        Random rd = new Random();
        char c = (char) (rd.nextInt(24) + (rd.nextInt(2) % 2 == 0 ? 'a' : 'A'));
        return c;
    }

    public static char generateOneNumber() {
        Random rd = new Random();
        char c = (char) (rd.nextInt(10) + '0');
        return c;
    }

    public static boolean judgeNamePasswd(String name, String passwd, ArrayList<Student> list) {
        for (Student s : list) {
            if (s.getName().equals(name) && s.getPasswd().equals(passwd)) {
                return true;
            }
        }
        return false;
    }
}
