package com.apress.bgn.ch4.lambda;

public class OperationDemo {
    public static void  main(String... args){
        Operation addition = (a, b) -> a * b;
        float result = addition.execute(2,5);
        System.out.println("Result is " + result);
    }
}
