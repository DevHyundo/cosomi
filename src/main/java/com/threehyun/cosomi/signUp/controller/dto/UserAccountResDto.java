package com.threehyun.cosomi.signUp.controller.dto;

import org.springframework.http.HttpStatus;

public class UserAccountResDto {

    HttpStatus httpStatus;
    String message;
    SignUpUserDto signUpUserDto;
}
