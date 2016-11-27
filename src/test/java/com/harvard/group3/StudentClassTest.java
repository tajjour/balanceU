package com.harvard.group3;

import com.harvard.group3.domain.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;



public class StudentClassTest {

    public Student makeTestStudent() {
        Student student = new Student("testFirstName", "testLastName", "testPassword", "testEmail", "testBirthdate", "testStudentID", "testProgram", 3.5, 2018);
        return student;
    }

    @Test
    public void constructorWithArgs() {
        Student student = makeTestStudent();
        assertNotNull("Null response", student);
    }

    @Test
    public void testGetProgram() {
        Student student = makeTestStudent();
        assertEquals("testProgram", student.getProgram());
    }

    @Test
    public void testSetProgram() {
        Student student = makeTestStudent();
        student.setProgram("newProgram");
        assertEquals("newProgram", student.getProgram());
    }

    @Test
    public void testGetBirthDate() {
        Student student = makeTestStudent();
        assertEquals("testBirthdate", student.getBirthDate());
    }

    @Test
    public void testSetBirthDate() {
        Student student = makeTestStudent();
        student.setBirthDate("newBirthDate");
        assertEquals("newBirthDate", student.getBirthDate());
    }

    @Test
    public void testGetEmail() {
        Student student = makeTestStudent();
        assertEquals("testEmail", student.getEmail());
    }

    @Test
    public void testSetEmail() {
        Student student = makeTestStudent();
        student.setEmail("newEmail");
        assertEquals("newEmail", student.getEmail());
    }

    @Test
    public void testGetLastName() {
        Student student = makeTestStudent();
        assertEquals("testLastName", student.getLname());
    }

    @Test
    public void testSetLastName() {
        Student student = makeTestStudent();
        student.setLname("newLastName");
        assertEquals("newLastName", student.getLname());
    }

    @Test
    public void testGetFirstName() {
        Student student = makeTestStudent();
        assertEquals("testFirstName", student.getFname());
    }

    @Test
    public void testSetFirstName() {
        Student student = makeTestStudent();
        student.setFname("newFirstName");
        assertEquals("newFirstName", student.getFname());
    }

    @Test
    public void testGetPassword() {
        Student student = makeTestStudent();
        assertEquals("testPassword", student.getPassword());
    }

    @Test
    public void testSetPassword() {
        Student student = makeTestStudent();
        student.setPassword("newPassword");
        assertEquals("newPassword", student.getPassword());
    }

    @Test
    public void testGetGradyear() {
        Student student = makeTestStudent();
        assertEquals(2018, student.getGradyear());
    }

    @Test
    public void testSetGradyear() {
        Student student = makeTestStudent();
        student.setGradyear(2019);
        assertEquals(2019, student.getGradyear());
    }

    @Test
    public void testGetStudentID() {
        Student student = makeTestStudent();
        assertEquals("testStudentID", student.getStudentID());
    }

    @Test
    public void testSetStudentID() {
        Student student = makeTestStudent();
        student.setStudentID("newStudentID");
        assertEquals("newStudentID", student.getStudentID());
    }

}
