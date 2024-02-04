package com.apress.bgn.ch1;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String... args){
        List<String> items = List.of("1","a","2","3","a","b","4","a");

        items.forEach(new Consumer<String>(){
            @Override

            public void accept(String item){
                if (item.equals("a")) {

                    System.out.println("A");
                }else{
                    System.out.println("Not A");
                }
            }
        });
    }
}
