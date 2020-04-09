package select.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import select.course.dao.TeacherDao;
import select.course.domain.Teacher;
import select.course.service.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;
    @Override
    public Teacher findByName(String teachernum, String password) throws Exception {
        return teacherDao.findByName(teachernum,password);
    }
}
