package select.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import select.course.domain.*;
import select.course.service.AdminService;
import select.course.service.BigAdminService;
import select.course.service.StudentService;
import select.course.service.TeacherService;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private BigAdminService bigAdminService;

    /**
     *
     * 登录模块，
     * @param login
     * @return
     * @throws Exception
     */
    @RequestMapping("/loginTo")
    public ModelAndView loginTo(login login) throws Exception{
        ModelAndView mv=new ModelAndView();
        if(login.getTypeId()==1){
            Student student=studentService .findByName(login.getStudentNum(),login.getPassWord());
            if(student.getStudentNum()!=null){
                mv.addObject("list",student);
                mv.setViewName("student-main");
                return mv;
            }else {
                mv.setViewName("failer");
            }
        }
        if(login.getTypeId()==2){
            Teacher teacher = teacherService.findByName(login.getStudentNum(), login.getPassWord());
            if (teacher.getId()!=null){
                mv.addObject("list",teacher);
                mv.setViewName("teacher-main");
                return mv;
            }else {
                mv.setViewName("failer");
            }

        }
        if(login.getTypeId()==3){
            Admin admin = adminService.findByName(login.getStudentNum(), login.getPassWord());
            if (admin.getId()!=null){
                mv.addObject("list",admin);
                mv.setViewName("admin-main");
                return mv;
            }
            else {
                mv.setViewName("failer");
            }
        }
        if(login.getTypeId()==4){
            BigAdmin bigAdmin = bigAdminService.findByName(login.getStudentNum(), login.getPassWord());
            if (bigAdmin.getId()!=null){
                mv.addObject("list",bigAdmin);
                mv.setViewName("bigadmin-main");
                return mv;
            }else {
                mv.setViewName("failer");
            }
        }

        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/logout")
    public ModelAndView logout()throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.clear();
        mv.setViewName("login");
        return mv;
    }
}
