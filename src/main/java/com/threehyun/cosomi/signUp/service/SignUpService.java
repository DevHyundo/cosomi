package com.threehyun.cosomi.signUp.service;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;

public interface SignUpService {

    /**이메일 중복 확인*/
    int userAccountDup(String userEmail);

    /**회원가입*/
    int userAccountIns(SignUpUserDto signUpUserDto);

}
