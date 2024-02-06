package com.apress.bgn.ch4.basic;

import com.apress.bgn.heirarchy.*;

import java.util.Scanner;

public class HumanDemo {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the world of Artists");
        System.out.println("Introduce yourself, please");
        System.out.println("Select options");
        System.out.println("1. Musician");
        System.out.println("2. Performer");
        System.out.println("3. Actor");

        int options = scanner.nextInt();
        switch(options){
            case 1:
                System.out.println("Name");
                String name = scanner.next();
                System.out.println("Age");
                int age = scanner.nextInt();
                System.out.println("Height");
                float height = scanner.nextFloat();
                Human musician = new Performer(name, age, height,Gender.MALE);
                Performer otherFields = new Performer(name, age, height, Gender.MALE);
                System.out.println("Music school attended");
                String musicSchool = scanner.next();
                otherFields.setMusicSchool(musicSchool);
                System.out.println("Set genre");
                String genre = scanner.next();
                otherFields.setGenre(genre);
                System.out.println("A popular song name");
                String song = scanner.next();
                otherFields.addSong(song);
                System.out.println(musician);
                break;
            case 2:
                System.out.println("Goodbye!");
                scanner.close();
                System.exit(0);

            default:
                System.out.println("Invalid !!!Please enter a valid option.");
        }
    }
}
