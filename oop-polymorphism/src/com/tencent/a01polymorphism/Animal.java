package com.tencent.a01polymorphism;

public class Animal{
    private String name;
    private String color;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void show(){
        System.out.printf("Animal的名字是%s，颜色为%s", getName(), getColor());
    }
    public void eat(String something){
        System.out.println("eating shit now~");
    }
}
