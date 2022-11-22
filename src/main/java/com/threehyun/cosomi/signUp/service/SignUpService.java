package com.threehyun.cosomi.signUp.service;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;

public interface SignUpService {

    /**
     * 사용자 > 회원가입 > 중복확인
     * @param {signUpUserDto}
     * @return {int}
     * */
    public int userAccountDupCheck(String userEmail);


    /**
     * 사용자 > 회원가입
     * @param {signUpUserDto}
     * @return {int}
     * */
    public int userAccountIns(SignUpUserDto signUpUserDto);

}
