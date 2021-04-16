package com.smallmonkey.perpul.hello.controller;

import com.smallmonkey.perpul.hello.service.HelloWorld;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    private HelloWorld helloWorld;

    public HelloController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @ApiOperation(value = "测试",notes = "直接返回String")
    @GetMapping(value = "/hello")
    public String hello() {
        return helloWorld.hello();
    }
}
