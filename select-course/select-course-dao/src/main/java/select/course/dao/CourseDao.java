package select.course.dao;

import org.apache.ibatis.annotations.*;
import select.course.domain.Course;
import select.course.domain.StudentRoom;
import select.course.domain.Teacher;

import java.util.List;

public interface CourseDao {

    @Select("select * from course where courseNum=#{coursenum}")
   /* @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "courseNum",property = "courseNum"),
            @Result(column = "courseName",property = "courseName"),
            @Result(column = "credit",property = "credit"),
            @Result(column = "period",property = "period"),
            @Result(column = "courseType",property = "courseType"),
            @Result(column = "term",property = "term"),
            @Result(column = "department",property = "department")
            *//*@Result(column = "teacherNum",property = "teacher",javaType = Teacher.class,
            one = @One(select = ("select.course.dao.TeacherDao.findByNum"))),
            @Result(column = "roomNum",property = "studentRomm",javaType = StudentRoom.class,
            one = @One(select = ("select.course.dao.StudentRoomDao.findByNum"))),
            @Result(column = "applyNum",property = "studentApply"),
            @Result(column = "adminNum",property = "admin")*//*
    })*/
    public Course findByNum(@Param("courseNum") String coursenum) throws Exception;
}
