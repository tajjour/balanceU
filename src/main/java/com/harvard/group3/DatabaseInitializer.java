package com.harvard.group3;

import com.harvard.group3.domain.Course;
import com.harvard.group3.domain.Professor;
import com.harvard.group3.domain.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */
@Component
public class DatabaseInitializer implements CommandLineRunner {

    private BalanceRepository balanceRepository;

    public DatabaseInitializer(BalanceRepository balanceRepository){
        this.balanceRepository = balanceRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        List<Course> courses = new ArrayList<>();

        Student s1 = new Student("Tarek", "Ajjour", "abc", "tajjour@g.harvard.edu", "12/28/1977", "tajjour", "Computer Science", 3.7, 2017);
        Student s2 = new Student("Alec", "Moeser", "def", "amoesor@g.harvard.edu", "11/28/1977", "amoesor", "Finance", 3.8, 2016);
        Student s3 = new Student("Than", "Hedman", "ghi", "thedman@g.harvard.edu", "10/28/1977", "thedman", "Physics", 3.7, 2018);
        Student s4 = new Student("Damian", "Kilday", "jkl", "dkilday@g.harvard.edu", "09/28/1977", "dkilday", "Math", 3.7, 2019);
        Student s5 = new Student("Wes", "Rolnick", "mno", "rolnick@g.harvard.edu", "08/28/1977", "wrolnick", "Accounting", 3.7, 2019);
        Student s6 = new Student("Walter", "Thornton", "qrs", "wthornton@g.harvard.edu", "07/28/1977", "wthornton", "Math", 3.7, 2019);

        Professor p1 = new Professor("Richard","Kasperowski","xyz","rkasperowski@g.harvard.edu","1/1/1970","rkasperowski",100000.00);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        Course course1 = new Course("CSCI-E71","Agile Methodolgy",p1,students,15,300,"on-line");
        courses.add(course1);

        balanceRepository.save(courses);
    }
}
