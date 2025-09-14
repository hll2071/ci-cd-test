package com.example.ci_cd_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "wow test";
    }
    
    @GetMapping("/test2")
    public String test2() {
        return "wlsWkwlsWk chlwhd";
    }
}
