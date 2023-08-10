package com.tencent.manageSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true){
            System.out.println("-----------Welcome to Student's Manage System");
            System.out.println("1:Add student");
            System.out.println("2:Edit student");
            System.out.println("3:Modify student");
            System.out.println("4:Search student");
            System.out.println("5:Exit");
            System.out.println("please enter your choice");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" ->{
                    System.out.println("please enter the student id");
                    int id = sc.nextInt();
                    System.out.println("please enter the student name");
                    String name = sc.next();
                    addStudent(list,id,name);
                }
                case "2" ->{
                    System.out.println("please enter the student id");
                    int id = sc.nextInt();
                    deleteStudent(list,id);
                }
                case "3" ->{
                    System.out.println("please enter the student id");
                    int id = sc.nextInt();
                    updateStudent(list,id);
                }
                case "4" ->{
                    System.out.println("please enter the student id or name");
                    int id = sc.nextInt();
                    queryStudent(list,id);
                }
                case "5" ->{
//                    break loop;
                    System.exit(0);
                }
                default -> {
                    System.out.println("no such choice, please type regularly!");
                }
            }
        }


    }

//    add student
    public static void addStudent(ArrayList<Student> list,int id, String name){
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                System.out.println("same id with before");
                flag = false;
                break;
            }
        }
        if (flag == true){
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            list.add(s);
            System.out.println("add successfully!");
        }
    }
    public static void deleteStudent(ArrayList<Student> list, int id){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                list.remove(i);
                flag = true;
                System.out.println("delete the id successfully");
                break;
            }
        }
        if (flag == false){
            System.out.println("this id does not exist");
        }
    }
    public static void updateStudent(ArrayList<Student> list, int id){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id){
                System.out.println("please enter the new name");
                String name = sc.next();
                list.get(i).setName(name);
                break;
            }
        }
        System.out.println("there is no such id");
    }
    public static void queryStudent(ArrayList<Student> list,int id){
//        if (list.size()==0){
//            System.out.println("currently, there is no information towards student");
//        }
//        else {
//            System.out.println("id"+"\t"+"name");
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName());
//            }
//        }
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId() == id){
                flag = true;
                System.out.println("id"+"\t"+"name");
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName());
                break;
            }
        }
        if (flag == false){
            System.out.println("currently, there is no information towards student");
        }
    }
    public static void queryStudent(ArrayList<Student> list, String name){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getName().equals(name)){
                flag = true;
                System.out.println("id      name");
                System.out.println(list.get(i).getId()+list.get(i).getName());
                break;
            }
        }
        if (flag == false){
            System.out.println("currently, there is no information towards student");
        }
    }
}
