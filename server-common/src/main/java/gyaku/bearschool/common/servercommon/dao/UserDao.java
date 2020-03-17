package gyaku.bearschool.common.servercommon.dao;

import gyaku.bearschool.common.servercommon.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {

    User find(Map<String, Object> param);

    List<User> findAll();
}
