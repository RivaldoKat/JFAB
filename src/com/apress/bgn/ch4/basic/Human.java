package com.apress.bgn.ch4.basic;

public abstract class Human{
    public static final int LIFESPAN = 100;
    private String name;
    private int age;

    private Gender gender;
    protected float height;

    public Human(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public Human(String name, int age, float height, Gender gender){
        this(name, age, gender);
        this.height = height;
    }

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

    public abstract int getTimeToLive();
}
