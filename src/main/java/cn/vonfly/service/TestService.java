package cn.vonfly.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/4.
 */
@Component
public class TestService {
    public String hello(){
        return "hello test service "+System.currentTimeMillis();
    }

}
