package com.harvard.group3;


import com.harvard.group3.domain.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ReportClassTest {

    public Report makeTestReport() {
        Report report = new Report("Harvard Extension School", "Programming Abstractions", "CSCI-E51", 10);
        return report;
    }

    @Test
    public void noArgConstructorWorks() {
        Report report = new Report();
        assertNotNull("Null response", report);
    }

    @Test
    public void FourArgConstructorWorks() {
        Report report = makeTestReport();
        assertNotNull("Null response", report);
    }

    @Test
    public void getSchool() {
        Report report = makeTestReport();
        assertEquals("Harvard Extension School", report.getSchool());
    }

    @Test
    public void getName() {
        Report report = makeTestReport();
        assertEquals("Programming Abstractions", report.getName());
    }

    @Test
    public void getNumber() {
        Report report = makeTestReport();
        assertEquals("CSCI-E51", report.getNumber());
    }

    @Test
    public void getWorkload() {
        Report report = makeTestReport();
        assertEquals(10, report.getWorkload());
    }

    @Test
    public void setSchool() {
        Report report = makeTestReport();
        report.setSchool("Wisconsin");
        assertEquals("Wisconsin", report.getSchool());
    }

    @Test
    public void setName() {
        Report report = makeTestReport();
        report.setName("Calculus 1");
        assertEquals("Calculus 1", report.getName());
    }

    @Test
    public void setNumber() {
        Report report = makeTestReport();
        report.setNumber("101");
        assertEquals("101", report.getNumber());
    }

    @Test
    public void setWorkload() {
        Report report = makeTestReport();
        report.setWorkload(18);
        assertEquals(18, report.getWorkload());
    }
}
