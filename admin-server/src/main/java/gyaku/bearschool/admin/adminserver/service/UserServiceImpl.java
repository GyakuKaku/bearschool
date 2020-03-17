package gyaku.bearschool.admin.adminserver.service;

import gyaku.bearschool.common.servercommon.dao.UserDao;
import gyaku.bearschool.common.servercommon.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userdao;

    @Override
    public List<User> findAll() {
        return userdao.findAll();
    }
}
