package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/")
    public String helloWorld(){
        return "Hello World......!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldbean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        //throw new RuntimeException("Something went wrong");
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }

}


