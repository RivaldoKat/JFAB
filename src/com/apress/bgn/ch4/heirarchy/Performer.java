package com.apress.bgn.heirarchy;


import com.apress.bgn.ch4.basic.Gender;
import com.apress.bgn.ch4.basic.Human;

import java.util.ArrayList;
import java.util.List;

public class Performer extends Human implements Musician, Actor {
    private String musicSchool;
    private String genre;
    private List<String> songs;
    private String actingSchool;
    private List<String> films;

    public Performer(String name, int age, float height, Gender gender){
        super(name, age, height, gender);
    }


    @Override
    public int getTimeToLive(){
        return (LIFESPAN - getAge()) / 2;
    }

    public String getMusicSchool(){
        return musicSchool;
    }

    public void setMusicSchool(String musicSchool){
        this.musicSchool = musicSchool;
    }

    public List<String> getSongs(){
        return songs;
    }

    public void setSongs(List<String> songs){
        this.songs = songs;
    }

    public void addSong(String song){
        this.songs = new ArrayList<>();
        this.songs.add(song);
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getActingSchool(){
        return actingSchool;
    }

    public void setActingSchool(String actingSchool){
        this.actingSchool = actingSchool;
    }

    public List<String> getFilms(){
        return films;
    }

    public void setFilms(List<String> films){
        this.films = films;
    }

    public void addFilm(String filmName){
        this.films.add(filmName);
    }

    @Override
    public String getSchool() {
        return null;
    }

    @Override
    public void setSchool(String school) {

    }

    @Override
    public String toString(){
        return "Name: " + getName() +
               "Age: " + getAge() +
               "Height: " + getHeight() +
               "Gender: " + Gender.MALE;
    }
}
