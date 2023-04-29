package com.sp.firstdockspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sp")
public class FirstController {

    @GetMapping("/a")
    public String getMessage(){

        return "Hi Sharad";
    }
}
