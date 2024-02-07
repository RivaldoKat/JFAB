package com.apress.bgn.ch4.ex;

import com.apress.bgn.ch4.heirarchy.Performer;

public class ExceptionDemo {
    public static void main(String... args){
        try{
            Performer p = PerformerGenerator.get("John");
            System.out.println("TTL: " + p.getTimeToLive());
        }catch (EmptyPerformerException e){
            System.out.println("Cannot use an empty performer because of " + e.getMessage());
        }
    }
}
