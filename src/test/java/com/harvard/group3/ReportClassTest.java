package com.harvard.group3;


import com.harvard.group3.domain.*;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ReportClassTest {

    public CourseInfo makeTestReport() {
        CourseInfo courseInfo = new Report("Harvard Extension School", "Programming Abstractions", "CSCI-E51", 10);
        return courseInfo;
    }

    @Test
    public void noArgConstructorWorks() {
        CourseInfo courseInfo = new Report();
        assertNotNull("Null response", courseInfo);
    }

    @Test
    public void FourArgConstructorWorks() {
        CourseInfo courseInfo = makeTestReport();
        assertNotNull("Null response", courseInfo);
    }

    @Test
    public void getSchool() {
        CourseInfo courseInfo = makeTestReport();
        assertEquals("Harvard Extension School", courseInfo.getSchool());
    }

    @Test
    public void getName() {
        CourseInfo courseInfo = makeTestReport();
        assertEquals("Programming Abstractions", courseInfo.getName());
    }

    @Test
    public void getNumber() {
        CourseInfo courseInfo = makeTestReport();
        assertEquals("CSCI-E51", courseInfo.getNumber());
    }

    @Test
    public void getWorkload() {
        CourseInfo courseInfo = makeTestReport();
        assertEquals(10, courseInfo.getWorkload());
    }

    @Test
    public void setSchool() {
        CourseInfo courseInfo = makeTestReport();
        courseInfo.setSchool("Wisconsin");
        assertEquals("Wisconsin", courseInfo.getSchool());
    }

    @Test
    public void setName() {
        CourseInfo courseInfo = makeTestReport();
        courseInfo.setName("Calculus 1");
        assertEquals("Calculus 1", courseInfo.getName());
    }

    @Test
    public void setNumber() {
        CourseInfo courseInfo = makeTestReport();
        courseInfo.setNumber("101");
        assertEquals("101", courseInfo.getNumber());
    }

    @Test
    public void setWorkload() {
        CourseInfo courseInfo = makeTestReport();
        courseInfo.setWorkload(18);
        assertEquals(18, courseInfo.getWorkload());
    }
}
