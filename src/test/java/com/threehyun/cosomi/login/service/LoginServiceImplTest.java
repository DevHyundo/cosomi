package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import com.threehyun.cosomi.login.dao.LoginDao;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class LoginServiceImplTest {

    @Autowired
    LoginDao loginDao;

    @Test
    @DisplayName("비밀번호 암호화 테스트")
    void encodePwd() {
        // given
        LoginProcessDto loginProcessDto = new LoginProcessDto();
        loginProcessDto.setEmail("Hello@naver.com");
        loginProcessDto.setPwd("12345");

        // when
        LoginService loginService = new LoginServiceImpl(loginDao);


        //then

    }

    @Test
    @DisplayName("login test")
    void login(){
        // g
        LoginProcessDto target = new LoginProcessDto();
        target.setEmail("test@gmail.com");
        target.setPwd("12345");

        // w
        LoginService loginService = new LoginServiceImpl(loginDao);
        TempUser resultUser = loginService.login(target);

        // t
        System.out.println(resultUser.getUSER_EMAIL());
        Assertions.assertThat(target.getEmail()).isEqualTo(resultUser.getUSER_EMAIL());

    }
}