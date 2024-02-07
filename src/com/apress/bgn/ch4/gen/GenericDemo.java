package com.apress.bgn.ch4.gen;

import com.apress.bgn.ch4.basic.Gender;
import com.apress.bgn.ch4.heirarchy.Performer;

public class GenericDemo {
    public static void main(String... args){
        Performer john = new Performer("John", 40, 1.5f, Gender.MALE);
        Performer jane = new Performer("Jane", 34,1.985f, Gender.FEMALE);

        Pair<Performer, Performer> performerPair = Pair.of(john, jane);
        System.out.println(performerPair);

        Pair<String, String> stringPair = Pair.of("John", "Jane");
        System.out.println(stringPair);

        Pair<String, Performer> stringPerformerPair = Pair.of("John", john);
        System.out.println(stringPerformerPair);

        System.out.println("All good!");
    }
}
