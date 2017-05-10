package com.hqq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by qing on 2017/5/10.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Map<String, Object> map) {
        map.put("hello", "hello world");
        return "index";
    }
}
