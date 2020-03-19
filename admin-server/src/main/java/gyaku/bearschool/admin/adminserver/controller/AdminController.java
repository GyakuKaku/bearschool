package gyaku.bearschool.admin.adminserver.controller;

import gyaku.bearschool.admin.adminserver.service.UserService;
import gyaku.bearschool.common.servercommon.domain.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class AdminController {

    @Autowired
    UserService userService;


    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(value = "/getAllUser", method = RequestMethod.POST)
    public JsonResult getAllUser(){
        Map<String, Object> map = new HashMap<>();
        map.put("userList", userService.findAll());
        return new JsonResult(map, 0, "success", true);
    }
}
