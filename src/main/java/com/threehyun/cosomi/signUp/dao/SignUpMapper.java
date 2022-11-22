package com.threehyun.cosomi.signUp.dao;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {

    /**
     * 사용자 > 회원가입 > 중복확인
     * @param {signUpUserDto}
     * @return {int}
     * */
    int userAccountDupCheck(String signUpUserDto);

    /**
     * 사용자 > 회원가입
     * @param {signUpUserDto}
     * @return {int}
     * */
    int userAccountIns(SignUpUserDto signUpUserDto);

}
