package com.tencent.studentsystem;

import com.sun.source.tree.ContinueTree;
import com.tencent.studentsystem.Student;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("---------Welcome----------------");
            System.out.println("1:add student");
            System.out.println("2:del student");
            System.out.println("3:adit student");
            System.out.println("4:search student");
            System.out.println("5:exit");
            System.out.print("shuru xuanze: ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> editStudent(list);
                case "4" -> searchStudent(list);
                case "5" -> System.exit(0);
                default -> System.out.println("?");
            }
        }

    }

    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("please input the id");
            id = sc.next();
            if (contains(list, id)) {
                System.out.println("alredy!");
            } else {
                s.setId(id);
                break;
            }
        }


        System.out.println("please input the name");
        String name = sc.next();
        s.setName(name);
        System.out.println("please input the age");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("please input the address");
        String address = sc.next();
        s.setAddress(address);
        list.add(s);
        System.out.println("add successfully");
    }

    public static void delStudent(ArrayList<Student> list) {
    }

    public static void editStudent(ArrayList<Student> list) {
    }

    public static void searchStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("none in list");
            return;
        }
        System.out.println("id\t\tname\tage\taddress\t");
        for (Student st : list) {
            System.out.println(st.getId() + "\t\t" + st.getName() + "\t" + st.getAge() + "\t" + st.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        for (Student student : list) {
            if (id.equals(student.getId())) {
                return true;
            }
        }
        return false;
    }
}
