package com.harvard.group3;

import com.harvard.group3.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */
@RestController
@RequestMapping(value = "/balanceU")
public class balanceController {

    private BalanceRepository balanceRepository;

    @Autowired
    public balanceController(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    @RequestMapping(value = "/allCoursesInfo")
    public List<Course> getAllCourses(){

        return balanceRepository.findAll();
    }
}
