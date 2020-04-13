package select.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import select.course.domain.SelectCourse;
import select.course.domain.Student;
import select.course.service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 测试
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Student> students = studentService.findAll();
        mv.addObject("studentList",students);
        mv.setViewName("student-message");
        return mv;
    }

    /**
     * 查找自己
     * @param studentNum
     * @return
     * @throws Exception
     */
    @RequestMapping("/findOne")
    public ModelAndView findOne(@RequestParam(name = "studentNum",required = true)String studentNum) throws Exception{
        ModelAndView mv=new ModelAndView();
        Student student = studentService.findByNum(studentNum);
        mv.addObject("student",student);
        mv.setViewName("student-message");
        return mv;
    }


    /**
     * 查看成绩
     * @param studentnum
     * @return
     * @throws Exception
     */
    @RequestMapping("/findScore")
    public ModelAndView findScore(@RequestParam(name="studentNum",required = true)String studentnum)throws Exception{
        ModelAndView mv=new ModelAndView();
        List<SelectCourse> selectCourses=studentService.findScore(studentnum);
        mv.addObject("scorelist",selectCourses);
        mv.setViewName("student-score");
        return mv;
    }

    @RequestMapping("/findSelectedCourse")
    public ModelAndView findSelectedCourse(@RequestParam(name = "studentNum",required = true)String studentnum)throws Exception{
        ModelAndView mv=new ModelAndView();
        List<SelectCourse> selectCourses=studentService.findHistoryCourse(studentnum);
        mv.addObject("courselist",selectCourses);
        mv.setViewName("student-historycourse");
        return mv;
    }
}
