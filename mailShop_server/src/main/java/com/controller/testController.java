package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2018/5/9.
 */
@RestController
public class testController {
    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }
}
