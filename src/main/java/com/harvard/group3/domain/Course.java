package com.harvard.group3.domain;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by tajjour on 2016-11-12.
 */

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String school;              //School Name
    private String number;              //Course Code-Number
    private String name;                //Course Name
    @OneToOne(cascade = {CascadeType.ALL})
    private Professor professor;        //Professor teaching Course
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Student> students;         //Student list enrolled in class
    private int maxNumOfEnrollments;    //Max number of enrollment in class
    private int courseLevel;            //Course Level i.e 1st year, 2nd year etc.
    private String style;               //Style of the course i.e online, on-campus, hybrid
    public int workload;               //Hours per week
    private int averageWorkload;
    private ArrayList<Integer> workloadArray = new ArrayList<>();


    public Course() {
    }

    public Course(String school, String number, String name, Professor professor, List<Student> students, int maxNumOfEnrollments, int courseLevel, String style, int workload) {
        this.school = school;
        this.number = number;
        this.name = name;
        this.professor = professor;
        this.students = students;
        this.maxNumOfEnrollments = maxNumOfEnrollments;
        this.courseLevel = courseLevel;
        this.style = style;
        this.workload = workload;
        workloadArray.add(workload);
        this.averageWorkload = getAverageWorkload();
    }

    public Course(String school, String name, String number, int workload) {
        this.school = school;
        this.number = number;
        this.name = name;
  /*      workloadArray.add(workload);
        this.averageWorkload = calculateAverageWorkload();*/
        addAndRecalculateWorkload(workload);
        this.workload = workload;
    }

    public ArrayList<Integer> getWorkloadArray () {
        return workloadArray;
    }

    public int calculateAverageWorkload() {
        int sum = 0;
        for (int reportedWorkload : workloadArray) {
            sum += reportedWorkload;
        }
        return sum / workloadArray.size();
    }

    public void addAndRecalculateWorkload(int newWorkload) {
        workloadArray.add(newWorkload);
        averageWorkload = calculateAverageWorkload();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public int getWorkload() {
        return workload;
    }

    public int getAverageWorkload() {
        return calculateAverageWorkload();
    }

    public void setWorkload(int workload) {
        this.workload = workload;
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
