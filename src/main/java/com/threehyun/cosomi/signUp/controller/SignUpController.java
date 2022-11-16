package com.threehyun.cosomi.signUp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @GetMapping("/signUp")
    public String getSignUpPage(){return "/signUp/signUpPage.html";}
}
