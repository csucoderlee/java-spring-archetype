package org.csu.coderlee.controller;

import org.csu.coderlee.constant.RequestThreadLocal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by bixi.lx
 * @created on 2018 07 31 11:15
 */
@Controller("/interceptor")
public class InterceptorTestController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test() {

        System.out.println(RequestThreadLocal.get().getRequestURI());
        return "success";
    }
}
