package com.harvard.group3.domain;

/**
 * Created by ajmoeser on 11/27/2016.
 */
public interface CourseInfo {
    String getSchool();

    String getName();

    String getNumber();

    int getWorkload();

    void setSchool(String school);

    void setName(String name);

    void setNumber(String number);

    void setWorkload(int workload);
}
