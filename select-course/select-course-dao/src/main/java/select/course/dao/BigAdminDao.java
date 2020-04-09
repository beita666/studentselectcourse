package select.course.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import select.course.domain.BigAdmin;

public interface BigAdminDao {

    /**
     * 根据badminNum查找
     * @param badminnum
     * @return
     * @throws Exception
     */
    @Select("select * from bigadmin where badminNum=#{badminnum}")
    public BigAdmin findBAByNum(String badminnum)throws Exception;

    /**
     * 通过前台传过来的用户名和密码来查找
     * @param num
     * @param password
     * @return
     * @throws Exception
     */
    @Select("select * from bigadmin where badminNum=#{num} and password=#{password}")
    @Results({
        @Result(id = true,property = "id",column = "id"),
        @Result(property = "badminNum",column = "badminNum"),
        @Result(property = "passWord",column = "passWord"),
        @Result(property = "name",column = "name"),
        @Result(property = "duty",column = "duty")
    })
    public BigAdmin findByName(@Param("num") String num, @Param("password") String password)throws Exception;
}
