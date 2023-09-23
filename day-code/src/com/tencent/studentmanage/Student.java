package com.tencent.studentmanage;

public class Student {
    private String name;
    private String passwd;
    private int id;
    private int phone;

    public Student(String name, String passwd, int id, int phone) {
        this.name = name;
        this.passwd = passwd;
        this.id = id;
        this.phone = phone;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
