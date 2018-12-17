package com.example.demo;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class Controller {
    @GetMapping("getUser2")
    public String getUser() {
        return "hello tow....";
    }
}
