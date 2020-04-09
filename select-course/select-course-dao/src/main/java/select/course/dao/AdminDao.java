package select.course.dao;

import org.apache.ibatis.annotations.*;
import select.course.domain.Admin;
import select.course.domain.BigAdmin;

public interface AdminDao {

    /**
     *
     * @param num
     * @param password
     * @return
     * @throws Exception
     */
    @Select("select * from admin where adminNum=#{num} and password=#{password}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "adminNum",column = "adminNum"),
            @Result(property = "passWord",column = "passWord"),
            @Result(property = "name",column = "name"),
            @Result(property = "duty",column = "duty"),
            @Result(property = "department",column = "department"),
            @Result(property = "bigAdmin",column = "badminNum",javaType = BigAdmin.class,
            one=@One(select = "select.course.dao.BigAdminDao.findBAByNum"))

    })
    public Admin findByName(@Param("num") String num, @Param("password") String password)throws Exception;
}
