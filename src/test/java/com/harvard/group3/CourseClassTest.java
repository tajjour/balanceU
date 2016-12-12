package com.harvard.group3;

import com.harvard.group3.domain.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


public class CourseClassTest {

    List<Student> testStudentList = new ArrayList();
    Professor testProfessor = new Professor();

    private Course makeCourseEmpty() {
        return new Course();
    }

    public Course makeCourseNineArgConstructor() {
        Course course = new Course("testSchool","101","testName", testProfessor, testStudentList, 100, 1, "testStyle",10);
        return course;
    }

    public Course makeCourseFourArgConstructor() {
        Course course = new Course("testSchool","testName", "101", 10);
        return course;
    }

    @Test
    public void constructorNoArgsWorks() {
        Course course = makeCourseEmpty();
        assertNotNull("Null response", course);
    }



    @Test
    public void constructorWithNineArgs() {
        Course course = makeCourseNineArgConstructor();
        assertNotNull("Null response", course);
    }

    @Test
    public void constructorWithFourArgs() {
        Course course = makeCourseFourArgConstructor();
        assertNotNull("Null response", course);
    }

    @Test
    public void testGetSchool() {
        Course course = makeCourseNineArgConstructor();
        assertEquals("testSchool", course.getSchool());
    }

    @Test
    public void testGetSchoolFourArgConstuctor() {
        Course course = makeCourseFourArgConstructor();
        assertEquals("testSchool", course.getSchool());
    }

    @Test
    public void testSetSchool() {
        Course course = makeCourseNineArgConstructor();
        course.setSchool("newSchool");
        assertEquals("newSchool", course.getSchool());
    }

    @Test
    public void testGetNumber() {
        Course course = makeCourseNineArgConstructor();
        assertEquals("101", course.getNumber());
    }

    @Test
    public void testSetNumber() {
        Course course = makeCourseNineArgConstructor();
        course.setNumber("202");
        assertEquals("202", course.getNumber());
    }

    @Test
    public void testGetName() {
        Course course = makeCourseNineArgConstructor();
        assertEquals("testName", course.getName());
    }

    @Test
    public void testSetName() {
        Course course = makeCourseNineArgConstructor();
        course.setName("newName");
        assertEquals("newName", course.getName());
    }

    @Test
    public void testGetStyle() {
        Course course = makeCourseNineArgConstructor();
        assertEquals("testStyle", course.getStyle());
    }

    @Test
    public void testSetStyle() {
        Course course = makeCourseNineArgConstructor();
        course.setStyle("newStyle");
        assertEquals("newStyle", course.getStyle());
    }

    @Test
    public void testGetCourseLevel() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(1, course.getCourseLevel());
    }

    @Test
    public void testSetCourseLevel() {
        Course course = makeCourseNineArgConstructor();
        course.setCourseLevel(2);
        assertEquals(2, course.getCourseLevel());
    }

    @Test
    public void testGetMaxEnrollment() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(100, course.getMaxNumOfEnrollments());
    }

    @Test
    public void testMaxEnrollment() {
        Course course = makeCourseNineArgConstructor();
        course.setMaxNumOfEnrollments(200);
        assertEquals(200, course.getMaxNumOfEnrollments());
    }

    @Test
    public void testGetProfessor() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(testProfessor, course.getProfessor());
    }

    @Test
    public void testSetProfessor() {
        Course course = makeCourseNineArgConstructor();
        Professor newProfessor = new Professor();
        course.setProfessor(newProfessor);
        assertEquals(newProfessor, course.getProfessor());
    }

    @Test
    public void testGetStudents() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(testStudentList, course.getStudents());
    }

    @Test
    public void testSetStudents() {
        Course course = makeCourseNineArgConstructor();
        List<Student> newStudentList = new ArrayList<>();
        course.setStudents(newStudentList);
        assertEquals(newStudentList, course.getStudents());
    }

    @Test
    public void testGetWorkload() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(10, course.getWorkload());
    }

    @Test
    public void testSetWorkload() {
        Course course = makeCourseNineArgConstructor();
        course.setWorkload(20);
        assertEquals(20, course.getWorkload());
    }

    @Test
    public void testGetAverageWorkloadOneWorkload() {
        Course course = makeCourseNineArgConstructor();
        assertEquals(10, course.getAverageWorkload());
    }

    @Test
    public void testGetAverageWorkloadTwoWorkloads() {
        Course course = makeCourseNineArgConstructor();
        course.addAndRecalculateWorkload(20);
        assertEquals(15, course.getAverageWorkload());
    }

    @Test
    public void addOneWorkloadAndRecalculate() {
        Course course = makeCourseNineArgConstructor();
        course.addAndRecalculateWorkload(20);
        assertEquals(15, course.getAverageWorkload());
    }

    @Test
    public void addMultipleWorkloadsAndRecalculate() {
        Course course = makeCourseNineArgConstructor();
        course.addAndRecalculateWorkload(20);
        course.addAndRecalculateWorkload(5);
        course.addAndRecalculateWorkload(25);
        assertEquals(15, course.getAverageWorkload());
    }

    @Test
    public void calculateAverageWorkloadEmptyArrayList() {
        Course course = makeCourseEmpty();
        assertEquals(0, course.calculateAverageWorkload());
    }

    @Test
    public void calculateAverageWorkloadSingletonArrayList() {
        Course course = makeCourseFourArgConstructor();
        assertEquals(10, course.calculateAverageWorkload());
    }

    @Test
    public void getInitialWorkloadArray() {
        Course course = makeCourseEmpty();
        assertNotNull("Null response", course.getWorkloadArray());
    }

    @Test
    public void changeAndGetWorkloadArray() {
        Course course = makeCourseEmpty();
        course.addAndRecalculateWorkload(5);
        assertNotNull("Null response", course.getWorkloadArray());
    }



}
