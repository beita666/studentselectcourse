package select.course.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import select.course.domain.StudentRoom;

public interface StudentRoomDao {

    @Select("select * from studentroom where roomNum=#{roomnum}")
    StudentRoom findByNum(@Param("roomNum") String roomnum) throws Exception;
}
