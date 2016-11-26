package com.harvard.group3;

import com.harvard.group3.domain.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */
@Controller
//@RestController
//@RequestMapping(value = "/balanceU")
public class balanceController {

    private CourseRepository courseRepository;

    @Autowired
    public balanceController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Course course){
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewCourse(Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        courseRepository.save(new Course(course.getSchool(), course.getName(), course.getNumber(), course.getWorkload()));
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }

    @RequestMapping(value = "/viewcourses", method = RequestMethod.GET)
    public String viewCourses(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "viewcourses";
    }

    @RequestMapping(value = "/listcourses", method = RequestMethod.GET)
    public String listCourses(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "listcourses";
    }

    @RequestMapping(value = "/listbyschool", method = RequestMethod.GET)
    public String listBySchool(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "listbyschool";
    }

    @RequestMapping(value = "/allCoursesInfo")
    public List<Course> getAllCourses(){

        return courseRepository.findAll();
    }
}
