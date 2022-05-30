package com.example.sonartest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Demo class
 *
 * @author Pons Wang
 * @version 1.0.0
 * @date 2022/5/30 16:25
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/test")
    public String test(){
        return "hello test";
    }

    @GetMapping("/test2")
    public String test2(){
        Date date = null;
        long time = date.getTime();
        return "hello test";
    }
}
