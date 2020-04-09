package select.course.service;

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
}
