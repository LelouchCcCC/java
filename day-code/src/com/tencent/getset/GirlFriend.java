package com.tencent.getset;

public class GirlFriend {
    private String name;
    private int age;

    public void setAge(int age){
        if (age>0 && age<=50){
            this.age = age;
        }

    }

    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }


}
