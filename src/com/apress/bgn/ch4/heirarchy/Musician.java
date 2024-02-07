package com.apress.bgn.ch4.heirarchy;
import java.util.List;
public interface Musician extends Artist{

    List<String> getSongs();
    void setSongs(List<String> songs);
    String getGenre();
    void setGenre(String genre);
    String toString();
}
