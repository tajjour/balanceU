package com.harvard.group3.domain;

import javax.persistence.*;

/**
 * Created by tajjour on 2016-11-12.
 */
@Entity
public class Professor extends Person {

    private  double salary;

    public Professor() {
        super();
    }

    public Professor(String fname, String lname, String password, String email, String birthdate, String profId, double salary) {
        super(fname, lname, password, email, birthdate);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" +
                ", salary=" + salary +
                '}';
    }
}
