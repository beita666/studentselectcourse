package select.course.service;

import select.course.domain.SelectCourse;
import select.course.domain.Student;

import java.util.List;

public interface StudentService {
    /**
     * 测试
     * @return
     * @throws Exception
     */
    List<Student> findAll() throws Exception;

    /**
     * 登录
     * @param studentNum
     * @param password
     * @return
     * @throws Exception
     */
    Student findByName(String studentNum,String password)throws Exception;

    /**
     * 查找一个
     * @param studentnum
     * @return
     * @throws Exception
     */
    Student findByNum(String studentnum)throws Exception;

    /**
     * 根据studentNum查找成绩
     * @param studentnum
     * @return
     * @throws Exception
     */
    List<SelectCourse> findScore(String studentnum) throws Exception;

    /**
     * 查找历史课程
     * @param studentnum
     * @return
     * @throws Exception
     */
    List<SelectCourse> findHistoryCourse(String studentnum) throws Exception;
}
