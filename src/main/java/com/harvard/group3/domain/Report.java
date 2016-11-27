package com.harvard.group3.domain;

/**
 * Created by ajmoeser on 11/27/2016.
 */
public class Report implements CourseInfo {

    private String school;
    private String number;
    private String name;
    private int workload;

    public Report() {}

    public Report(String school, String name, String number, int workload) {
        this.school = school;
        this.number = number;
        this.name = name;
        this.workload = workload;
    }

    @Override
    public String getSchool() {
        return school;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public int getWorkload() {
        return workload;
    }


    @Override
    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
