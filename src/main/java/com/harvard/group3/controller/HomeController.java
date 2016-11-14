package com.harvard.group3.controller;
import com.harvard.group3.BalanceRepository;
import com.harvard.group3.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @Autowired
    private BalanceRepository balanceRepository;

   /* @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Course course){
        return "index";
    }
*/

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewCourse(Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        balanceRepository.save(new Course(course.getNumber(),course.getName(), course.getProfessor(), null, course.getMaxNumOfEnrollments(),course.getCourseLevel(), course.getStyle()));
        model.addAttribute("courses", balanceRepository.findAll());
        return "redirect:viewcourses";
    }

    @RequestMapping(value = "/viewcourses", method = RequestMethod.GET)
    public String showAllCourses(Model model) {
        model.addAttribute("courses", balanceRepository.findAll());
        return "viewcourses";

    }
}
