package select.course.dao;

import org.apache.ibatis.annotations.*;
import select.course.domain.Student;
import select.course.domain.StudentClass;

import java.util.List;

public interface StudentDao {

    //测试用的
    @Select("select * from student")
    List<Student> findAll() throws Exception;

    /**
     * 验证输入的学生号和密码是否正确
     * @param studentNum
     * @param password
     * @return
     * @throws Exception
     */
    @Select("select * from student where studentNum=#{studentNum} and password=#{password} ")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "studentNum",column = "studentNum"),
            @Result(property = "password",column = "password"),
            @Result(property = "name",column = "name"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "department",column = "department"),
            @Result(property = "profession",column = "profession"),
            @Result(property = "enterTime",column = "enterTime"),
            @Result(property = "type",column = "type"),
            @Result(property = "phoneNumber",column = "phoneNumber"),
            @Result(column = "classNum",property = "studentClass",javaType = StudentClass.class,
                    one = @One(select = "select.course.dao.StudentClassDao.findSCById"))
    }
    )
    public Student findByName(@Param("studentNum") String studentNum,@Param("password") String password) throws Exception;

    @Select("select * from student where studentNum=#{studentnum}")
    public Student findByNum(@Param("studentnum") String studentnum) throws Exception;
}
