package com.apress.bgn.ch4.basic;
import static java.lang.Math.*;


public class Sample extends Object{
    public static void main(String... args){
       System.out.println(Gender.FEMALE.comment());
       System.out.println(Gender.MALE.comment());
        System.out.println(Gender.UNDEFINED.comment());
    }
}
