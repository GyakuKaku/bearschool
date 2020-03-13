package gyaku.bearschool.admin.adminserver.service;

import gyaku.bearschool.common.servercommon.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface UserService {
    @RequestMapping(value = "/findAll")
    List<User> findAll();
}
