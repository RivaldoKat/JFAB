package com.apress.bgn.ch4.heirarchy;

public interface Artist {
    String getSchool();
    void setSchool(String school);

    default boolean isCreative(){
        return true;
    };
}
