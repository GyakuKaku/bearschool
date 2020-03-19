package gyaku.bearschool.common.servercommon.dao;

import gyaku.bearschool.common.servercommon.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("SELECT * FROM user")
    List<User> findAll();
}
