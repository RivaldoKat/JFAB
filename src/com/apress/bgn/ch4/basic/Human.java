package com.apress.bgn.ch4.basic;

class Human{
    static final int LIFESPAN = 100;
    private String name;
    private int age;
    private float height;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }
}
