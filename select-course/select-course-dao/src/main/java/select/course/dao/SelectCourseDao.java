package select.course.dao;

import org.apache.ibatis.annotations.*;
import select.course.domain.Course;
import select.course.domain.SelectCourse;
import select.course.domain.Student;

import java.util.List;

public interface SelectCourseDao {

    @Select("select * from selectcourse where studentNum=#{studentNum}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "selectNum",property = "selectNum"),
            @Result(column = "score",property = "score"),
            @Result(column = "studentNum",property = "studentNum"),
            @Result(column = "courseNum",property = "course",javaType = Course.class,
            one = @One(select = "select.course.dao.CourseDao.findByNum"))
    })
    public List<SelectCourse> findScore(String studentNum)throws Exception;


}
