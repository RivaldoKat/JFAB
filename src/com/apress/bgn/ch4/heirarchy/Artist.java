package com.apress.bgn.heirarchy;

public interface Artist {
    String getSchool();
    void setSchool(String school);

    default boolean isCreative(){
        return true;
    };
}
