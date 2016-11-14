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

    public Course makeTestCourse() {
        Course course = new Course("101","testName", testProfessor, testStudentList, 100, 1, "testStyle");
        return course;
    }

    @Test
    public void constructorWorks() {
        Course course = new Course();
        assertNotNull("Null response", course);
    }

    @Test
    public void constructorWithArgs() {
        Course course = makeTestCourse();
        assertNotNull("Null response", course);
    }

    @Test
    public void testGetNumber() {
        Course course = makeTestCourse();
        assertEquals("101", course.getNumber());
    }

    @Test
    public void testSetNumber() {
        Course course = makeTestCourse();
        course.setNumber("202");
        assertEquals("202", course.getNumber());
    }

    @Test
    public void testGetName() {
        Course course = makeTestCourse();
        assertEquals("testName", course.getName());
    }

    @Test
    public void testSetName() {
        Course course = makeTestCourse();
        course.setName("newName");
        assertEquals("newName", course.getName());
    }

    @Test
    public void testGetStyle() {
        Course course = makeTestCourse();
        assertEquals("testStyle", course.getStyle());
    }

    @Test
    public void testSetStyle() {
        Course course = makeTestCourse();
        course.setStyle("newStyle");
        assertEquals("newStyle", course.getStyle());
    }

    @Test
    public void testGetCourseLevel() {
        Course course = makeTestCourse();
        assertEquals(1, course.getCourseLevel());
    }

    @Test
    public void testSetCourseLevel() {
        Course course = makeTestCourse();
        course.setCourseLevel(2);
        assertEquals(2, course.getCourseLevel());
    }

    @Test
    public void testGetMaxEnrollment() {
        Course course = makeTestCourse();
        assertEquals(100, course.getMaxNumOfEnrollments());
    }

    @Test
    public void testMaxEnrollment() {
        Course course = makeTestCourse();
        course.setMaxNumOfEnrollments(200);
        assertEquals(200, course.getMaxNumOfEnrollments());
    }

    @Test
    public void testGetProfessor() {
        Course course = makeTestCourse();
        assertEquals(testProfessor, course.getProfessor());
    }

    @Test
    public void testSetProfessor() {
        Course course = makeTestCourse();
        Professor newProfessor = new Professor();
        course.setProfessor(newProfessor);
        assertEquals(newProfessor, course.getProfessor());
    }

    @Test
    public void testGetStudents() {
        Course course = makeTestCourse();
        assertEquals(testStudentList, course.getStudents());
    }

    @Test
    public void testSetStudents() {
        Course course = makeTestCourse();
        List<Student> newStudentList = new ArrayList<>();
        course.setStudents(newStudentList);
        assertEquals(newStudentList, course.getStudents());
    }

}
