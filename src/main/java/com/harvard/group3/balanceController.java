package com.harvard.group3;

import com.harvard.group3.domain.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;



import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */
@Controller
public class balanceController {

    private CourseRepository courseRepository;

    @Autowired
    public balanceController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @RequestMapping(value="/welcome.html", method=RequestMethod.GET)
    String index(){
        //model.addAttribute("courses", courseRepository.findAll());
        return "welcome";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Model model, Course course){
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }

    @RequestMapping(value = "/addClass.html", method = RequestMethod.POST)
    public String addNewCourse(Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        courseRepository.save(new Course(course.getSchool(), course.getName(), course.getNumber(), course.getWorkload()));
        model.addAttribute("courses", courseRepository.findAll());
        return "addClass";
    }

    @RequestMapping(value = "/addClass.html", method = RequestMethod.GET)
    public String submitCourse(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "viewcourses";
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

    @RequestMapping(value = "/listbyschool", method = RequestMethod.POST)
    public String listBySchool(@ModelAttribute Course course, BindingResult errors, Model model) {
        model.addAttribute("courses", courseRepository.findBySchool(course.getSchool()));
        return "listbyschool";
    }

    @RequestMapping(value = "/allCoursesInfo")
    public List<Course> getAllCourses(){

        return courseRepository.findAll();
    }
}
