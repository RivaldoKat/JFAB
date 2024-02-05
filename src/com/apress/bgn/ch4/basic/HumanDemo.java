package com.apress.bgn.ch4.basic;

public class HumanDemo {
    public static void main(String... args){
        Musicians johnSmith = new Musicians("John", 24, 14.4f,
                "Best College", "Pop");
        Actors johnTylor = new Actors("John", 14,
                12.3f, "Acting College");
        System.out.println("Name: " + johnSmith.getName());
        System.out.println("Age: " + johnSmith.getAge());
        System.out.println("Height: " + johnSmith.getHeight());
        System.out.println("Lifespan: " + Human.LIFESPAN + " time to live " + johnSmith.getTimeToLive());

    }
}
