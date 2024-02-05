package com.apress.bgn.ch4.basic;

class Human{
    static final int LIFESPAN = 100;
    String name;
    int age;
    float height;
}
public class HumanDemo {
    public static void main(String... args){
        Human katlego = new Human();
        katlego.name = "Katlego";
        katlego.age = 23;
        katlego.height = 7.2f;
        System.out.println("Name: " + katlego.name);
        System.out.println("Age: " + katlego.age);
        System.out.println("Height: " + katlego.height);
        System.out.print("Lifespan: " + Human.LIFESPAN);
    }
}
