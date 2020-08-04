package com.miaoshaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration   //将app的启动类当成一个自动化可以支持配置的bean，自动加载
@RestController    //实现springmvc的controller

public class App 
{
    @RequestMapping("/")
    public String home(){
        return "hello world!";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
