package com.threehyun.cosomi.signUp.controller;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import com.threehyun.cosomi.signUp.controller.dto.UserAccountResponse;
import com.threehyun.cosomi.signUp.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    @Autowired
    SignUpService signUpService;

    @RequestMapping(method = {RequestMethod.GET}, value = "/signUp")
    public String getSignUpPage(){return "/signUp/signUpPage.html";}


    @RequestMapping(method = {RequestMethod.POST}, value = "/signUp/signUpProcess")
    @ResponseBody
    public ResponseEntity<UserAccountResponse> signUpProcess(@RequestBody SignUpUserDto signUpUserDto){

        String ms = "";
        HttpStatus hs;

        int insFlag = signUpService.userAccountIns(signUpUserDto);

        if(insFlag>0){
            ms = "회원가입 성공";
            hs = HttpStatus.OK;
        }else{
            ms = "회원가입 실패";
            hs = HttpStatus.NOT_FOUND;
        }
        UserAccountResponse uar = UserAccountResponse.builder()
                .httpStatus(hs)
                .message(ms)
                .build();

        return new ResponseEntity<UserAccountResponse>(uar, uar.getHttpStatus());
    }




}
