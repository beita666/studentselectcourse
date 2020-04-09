package select.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import select.course.dao.AdminDao;
import select.course.domain.Admin;
import select.course.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin findByName(String num, String password) throws Exception {
        return adminDao.findByName(num,password);
    }
}
