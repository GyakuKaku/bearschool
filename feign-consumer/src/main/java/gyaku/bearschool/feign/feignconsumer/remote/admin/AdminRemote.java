package gyaku.bearschool.feign.feignconsumer.remote.admin;

import gyaku.bearschool.common.servercommon.domain.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name= "admin-server",fallback = AdminRemoteHystrix.class)
public interface AdminRemote {

    @RequestMapping(value = "/user/getAllUser", method= RequestMethod.POST)
    JsonResult getAllUser();

    @RequestMapping(value = "/server/getInfo", method= RequestMethod.POST)
    JsonResult getInfo();

}
