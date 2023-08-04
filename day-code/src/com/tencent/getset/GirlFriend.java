package com.tencent.getset;

public class GirlFriend {
    private String name;
    private int age;

    public void setAge(int n){
        if (n>0 && n<=50){
            age = n;
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
