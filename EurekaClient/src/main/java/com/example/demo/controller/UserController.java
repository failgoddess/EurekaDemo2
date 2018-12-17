package com.example.demo.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    private IUserService userService;

//    @GetMapping("getUser")
//    public List<UserEntity> getUser() {
//        UserEntity user = new UserEntity();
//        return userService.getUser();
//    }
    @Autowired
    private EurekaClient eurekaClients;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("getUser")
    public String getUser() {
        //todo 得到eureka server的服务实例
        InstanceInfo info=eurekaClients.getNextServerFromEureka("Eureka-client",false);
//        return info.getHomePageUrl();
        return "hello one";
    }

//    @GetMapping("getInstance_info")
//    public String getInstance_info() {
//        //todo 得到eureka server的服务实例
//        Applications app=this.discoveryClient.getApplications();
//        return app.toString();
//    }
}

