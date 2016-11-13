package com.harvard.group3.domain;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String number;              //Course Code-Number
    private String name;                //Course Name
    @OneToOne(cascade = {CascadeType.ALL})
    private Professor professor;        //Professor teaching Course
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Student> students;         //Student list enrolled in class
    private int maxNumOfEnrollments;    //Max number of enrollment in class
    private int courseLevel;            //Course Level i.e 1st year, 2nd year etc.
    private String style;               //Style of the course i.e online, on-campus, hybrid

    public Course() {
    }

    public Course(String number, String name, Professor professor, List<Student> students, int maxNumOfEnrollments, int courseLevel, String style) {
        this.number = number;
        this.name = name;
        this.professor = professor;
        this.students = students;
        this.maxNumOfEnrollments = maxNumOfEnrollments;
        this.courseLevel = courseLevel;
        this.style = style;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getMaxNumOfEnrollments() {
        return maxNumOfEnrollments;
    }

    public void setMaxNumOfEnrollments(int maxNumOfEnrollments) {
        this.maxNumOfEnrollments = maxNumOfEnrollments;
    }

    public int getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(int courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", professor=" + professor +
                ", students=" + students.toString() +
                ", maxNumOfEnrollments=" + maxNumOfEnrollments +
                ", courseLevel=" + courseLevel +
                ", style='" + style + '\'' +
                '}';
    }
}
