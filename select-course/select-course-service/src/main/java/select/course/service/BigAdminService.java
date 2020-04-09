package select.course.service;

import select.course.domain.BigAdmin;

public interface BigAdminService {
    BigAdmin findByName(String num,String password)throws Exception;
}
