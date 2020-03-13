package gyaku.bearschool.feign.feignconsumer.remote.admin;

import gyaku.bearschool.common.servercommon.domain.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class AdminRemoteHystrix implements AdminRemote {
    @Override
    public JsonResult getAllUser() {
        return new JsonResult(null, 100, "服务器发生异常", false);
    }

    @Override
    public JsonResult getInfo() {
        return new JsonResult(null, 100, "服务器发生异常", false);
    }
}
