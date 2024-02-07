package com.apress.bgn.ch4.ex;

import com.apress.bgn.ch4.basic.Gender;
import com.apress.bgn.ch4.heirarchy.Performer;

public class PerformerGenerator {
    public static Performer get(String name) throws EmptyPerformerException{
        return new Performer(name, 40,1.91f, Gender.MALE);
    }
}
