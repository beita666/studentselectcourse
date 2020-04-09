package select.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import select.course.dao.StudentDao;
import select.course.domain.Student;
import select.course.service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 测试
     * @return
     * @throws Exception
     */
    @Override
    public List<Student> findAll() throws Exception {
        return studentDao.findAll();
    }

    /**
     * 登录
     * @param studentNum
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public Student findByName(String studentNum,String password) throws Exception {

        return studentDao.findByName(studentNum,password);
    }

    /**
     * 查找一个
     * @param studentnum
     * @return
     * @throws Exception
     */
    @Override
    public Student findByNum(String studentnum) throws Exception {
        return studentDao.findByNum(studentnum);
    }
}
