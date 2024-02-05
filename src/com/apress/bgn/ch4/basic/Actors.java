package com.apress.bgn.ch4.basic;

import java.util.List;

class Actors extends Human{
    private String  actingSchool;
    private List<String> films;

    public Actors(String name, int age, float height, String actingSchool){
        super(name,age,height);
        this.actingSchool = actingSchool;
    }

    public int getTimeToLive(){
        return (LIFESPAN - getAge());
    }
    public String getActingSchool() {
        return actingSchool;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
