package gyaku.bearschool.admin.adminserver.controller;

import gyaku.bearschool.common.servercommon.domain.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    DiscoveryClient client;

    /**
     * 获取服务运行信息
     * @return
     */
    @RequestMapping(value = "/getInfo")
    public JsonResult getInfo(){
        List<Map> resultList = new ArrayList<>();
        List<ServiceInstance> instances = client.getInstances("admin-server");
        for (ServiceInstance instance : instances) {
            Map<String, Object> map = new HashMap<>();
            map.put("serviceId", instance.getServiceId());
            map.put("host", instance.getHost());
            map.put("port", instance.getPort());
            resultList.add(map);
        }
        return new JsonResult(resultList, 0, "success", true);
    }
}
