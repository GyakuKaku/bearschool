package gyaku.bearschool.admin.adminserver.dao;

import gyaku.bearschool.common.servercommon.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserDao {

    User find(Map<String, Object> param);

    List<User> findAll();
}
