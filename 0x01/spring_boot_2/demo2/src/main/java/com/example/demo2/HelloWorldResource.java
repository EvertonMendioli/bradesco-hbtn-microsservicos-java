package com.example.demo2;

@RestController
@RequestMapping(value="/messages")
public class HelloWorldResource {

    @GetMapping("/home")
    public String home(){
       return "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
    }
}
