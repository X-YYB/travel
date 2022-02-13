package com.young.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: yangyb
 * @Date:2022/2/13 18:16
 * Version: 1.0
 **/
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "Hello springboot!!!";
    }
}
