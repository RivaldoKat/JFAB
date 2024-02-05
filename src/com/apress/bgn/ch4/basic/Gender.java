package com.apress.bgn.ch4.basic;

public enum Gender {
    FEMALE(1, "f"),
    MALE(2, "m"),
    UNDEFINED(3, "u"){
        @Override
        public String comment(){
            return "to be decided later:" + getDescr() + "," + getRepr();
        }
    };

    private final int repr;
    private final String descr;

    Gender(int repr, String descr){
        this.repr = repr;
        this.descr = descr;
    }

    public int getRepr(){
        return repr;
    }

    public String getDescr(){
        return descr;
    }

    public String comment(){
        return repr + ":" + descr;

    }
}
