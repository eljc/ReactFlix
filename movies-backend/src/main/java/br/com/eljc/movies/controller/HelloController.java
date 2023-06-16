package br.com.eljc.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping("/")
    public String apiRoot(){
        return "Hello world";
    }

}
