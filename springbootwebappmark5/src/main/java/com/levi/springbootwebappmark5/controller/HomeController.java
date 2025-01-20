package com.levi.springbootwebappmark5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller //We can use @RestController annotation to print "Hello World" as data and not as a file name Spring is supposed to look for. *
@RestController
public class HomeController {

    @RequestMapping("/")   
    //* We can write @ResponseBody here to do essentially the same.
    public String greet(){
        return "Hello World"; //When this method is called, it's looking for a file called "Hello World".
    }

    @RequestMapping("/about")
    public String aboutmethod() {
        return "This is about";
    }
    

}
