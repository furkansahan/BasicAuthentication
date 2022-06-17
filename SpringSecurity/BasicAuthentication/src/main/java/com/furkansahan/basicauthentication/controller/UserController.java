package com.furkansahan.basicauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index")
    public  String index(){
        return "Index Page ,Welcome";
}

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Login Success here is the dashboard page ";
}


}
