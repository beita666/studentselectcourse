package select.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import select.course.domain.Student;
import select.course.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Student> students = studentService.findAll();
        mv.addObject("studentList",students);
        mv.setViewName("student-message");
        return mv;
    }

    @RequestMapping("/findOne")
    public ModelAndView findOne(@RequestParam(name = "studentNum",required = true)String studentnum) throws Exception{
        ModelAndView mv=new ModelAndView();
        Student student = studentService.findByNum(studentnum);
        mv.addObject("student",student);
        mv.setViewName("student-message");
        return mv;
    }
}
