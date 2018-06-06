package com.qixu.eureka.client.controller;

import com.qixu.eureka.client.api.ClientOneApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author castle
 * @date 2018/6/5 19:34
 **/
@RestController
public class CilentTwoController {
    @Autowired
    private ClientOneApi clientOneApi;

    @RequestMapping(value = "/sayFrom",method = RequestMethod.GET)
    public String say() {
        System.out.println("jin lai le !");
        String a  = clientOneApi.sayHello("castle222");
        System.out.println(a);
        return "ok";
    }
}
