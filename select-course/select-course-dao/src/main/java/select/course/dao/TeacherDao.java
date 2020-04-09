package select.course.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import select.course.domain.Teacher;

public interface TeacherDao {

    @Select("select * from teacher where teacherNum=#{teachernum} and password=#{password}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "teacherNum",column = "teacherNum"),
            @Result(property = "passWord",column = "passWord"),
            @Result(property = "name",column = "name"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "department",column = "department"),
            @Result(property = "jobTitle",column = "jobTitle"),
            @Result(property = "phoneNumber",column = "phoneNumber"),

    })
    public Teacher findByName(@Param("teachernum") String teachernum, @Param("password") String password)throws Exception;
}
