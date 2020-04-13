package select.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import select.course.dao.SelectCourseDao;
import select.course.dao.StudentDao;
import select.course.domain.SelectCourse;
import select.course.domain.Student;
import select.course.service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private SelectCourseDao selectCourseDao;

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

    /**
     *
     * @param studentnum
     * @return
     * @throws Exception
     */
    @Override
    public List<SelectCourse> findScore(String studentnum) throws Exception {
        return selectCourseDao.findScore(studentnum);
    }

    /**
     *
     * @param studentnum
     * @return
     * @throws Exception
     */
    @Override
    public List<SelectCourse> findHistoryCourse(String studentnum) throws Exception {
        List<SelectCourse> lists=selectCourseDao.findScore(studentnum);
        for (int i=0;i<lists.size();i++){
            String term=lists.get(i).getCourse().getTerm();
            if (term!="20下") {
                return lists;
            }else {
                lists.remove(i);
                return lists;
            }

        }
        return null;
    }
}
