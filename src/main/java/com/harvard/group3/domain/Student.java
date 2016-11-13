package com.harvard.group3.domain;

import javax.persistence.Entity;

/**
 * Created by tajjour on 2016-11-12.
 */
@Entity
public class Student extends Person {
    private String program;
    private double gpa;
    private int gradyear;

    public Student(){}

    public Student(String fname, String lname, String password, String email, String birthdate, String studentId, String program, double gpa, int gradyear) {
        super(fname, lname, password, email, birthdate);

        this.program = program;
        this.gpa = gpa;
        this.gradyear = gradyear;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }



    public String getProgram() {
        return program;
    }

    public double getGpa() {
        return gpa;
    }

    public int getGradyear() {
        return gradyear;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", program='" + program + '\'' +
                ", gpa=" + gpa +
                ", gradyear=" + gradyear +
                '}';
    }
}
