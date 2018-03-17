package cn.vonfly.web.controller;

import cn.vonfly.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/4.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/hello")
    public @ResponseBody  String hello(){
        return testService.hello();
    }

}
