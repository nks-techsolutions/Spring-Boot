package com.spring.azure.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nirajkumar.shukla
 */
@RestController
@RequestMapping("/hello")
public class SpringAKSController {

    @GetMapping
    public String hello(){
        return "Hi, You have successfully created a container and deployed your applications in Kubernetes Pods";
    }

}
