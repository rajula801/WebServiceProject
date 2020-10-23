package com.rajula.WebServiceProject.constroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(value="/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello "+name;

    }
}
