package select.course.dao;

import org.apache.ibatis.annotations.Select;
import select.course.domain.StudentClass;

public interface StudentClassDao {

    @Select("select * from studentclass where classNum=#{classNum}")
    public StudentClass findSCById(String classNum) throws Exception;
}
