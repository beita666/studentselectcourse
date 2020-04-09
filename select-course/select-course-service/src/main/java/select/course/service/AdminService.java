package select.course.service;

import select.course.domain.Admin;

public interface AdminService {

    Admin findByName(String num,String password)throws Exception;
}
