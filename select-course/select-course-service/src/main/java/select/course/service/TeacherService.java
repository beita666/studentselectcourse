package select.course.service;

import select.course.domain.Teacher;

public interface TeacherService {

    Teacher findByName(String teachernum,String password)throws Exception;
}
