package org.wanghong.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: 王鸿
 * @Description:
 * @Date Created in 2026-06-24 11:07
 * @Modified By:
 */
//@Controller
//@ResponseBody
@RestController//复合注解
public class HelloController {

    //@RequestMapping(value = "hello",method = request);
    @GetMapping("hello")
    public String hello(){
        return "hello spring boot";
    }
}
