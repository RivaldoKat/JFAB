package com.apress.bgn.ch4.basic;

public class HumanDemo {
    public static void main(String... args){
        Human katlego = new Human();
        katlego.setName("Katlego");
        katlego.setAge(23);
        katlego.setHeight(14.2f);

        System.out.println("Name: " + katlego.getName());
        System.out.println("Age: " + katlego.getAge());
        System.out.println("Height: " + katlego.getHeight());
        System.out.print("Lifespan: " + Human.LIFESPAN);
    }
}
