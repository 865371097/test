package com.uas.dingzhiconnect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    @RequestMapping("/apple")
    public String test2() {
        return "new version";
    }

    @RequestMapping("/apple2")
    public String apple2() {
        return "new version apple2";
    }
}
