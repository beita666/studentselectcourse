package select.course.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import select.course.dao.BigAdminDao;
import select.course.domain.BigAdmin;
import select.course.service.BigAdminService;

@Service
public class BigAdminServiceImpl implements BigAdminService {

    @Autowired
    private BigAdminDao bigAdminDao;
    @Override
    public BigAdmin findByName(String num, String password) throws Exception {
        return bigAdminDao.findByName(num,password);
    }
}
