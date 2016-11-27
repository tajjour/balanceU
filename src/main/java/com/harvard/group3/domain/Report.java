package com.harvard.group3.domain;

/**
 * Created by ajmoeser on 11/27/2016.
 */
public class Report {

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

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getWorkload() {
        return workload;
    }


    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
