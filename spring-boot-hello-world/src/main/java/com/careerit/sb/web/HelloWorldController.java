package com.careerit.sb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/greet")
    public String hello() {
        return "Hello World";
    }
}
