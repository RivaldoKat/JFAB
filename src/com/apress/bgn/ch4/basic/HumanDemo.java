package com.apress.bgn.ch4.basic;
import com.apress.bgn.heirarchy.*;

public class HumanDemo {
    public static void main(String... args){
        Performer performer;

        performer = new Performer("John", 24, 14.5f, Gender.MALE);
        performer.setActingSchool("Polish Academy");
        System.out.println("Name: " + performer.getName());
        System.out.println("Age: " + performer.getAge());
        System.out.println("Height: " + performer.getHeight());
        System.out.println(Gender.MALE);
        System.out.println("Acting School" + performer.getActingSchool());
    }
}
