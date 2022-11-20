package com.threehyun.cosomi.signUp.controller;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import com.threehyun.cosomi.signUp.controller.dto.UserAccountResDto;
import com.threehyun.cosomi.signUp.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(){return "/signUp/signUpPage.html";}

//    @PostMapping("/signUp/process")
//    public ResponseEntity<UserAccountResDto> setUserAccount(SignUpUserDto signUpUserDto){
//        UserAccountResDto uard = new UserAccountResDto();
//
//
//
//
//        return uard;
//    }

}
