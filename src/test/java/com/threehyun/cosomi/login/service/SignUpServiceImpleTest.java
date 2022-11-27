package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import com.threehyun.cosomi.signUp.dao.SignUpMapper;
import com.threehyun.cosomi.signUp.service.SignUpService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SignUpServiceImpleTest {

    @Autowired
    SignUpMapper signUpMapper;
    @Autowired
    SignUpService signUpService;

    @Test
    @DisplayName("이메일 중복 확인")
    void userActDupl(){
        //given
        String userEmail = "test@gmail.com";

        //when
        int result = signUpService.userAccountDupCheck(userEmail);

        //then
        Assertions.assertThat(result).isEqualTo(1);
    }


    @Test
    @DisplayName("회원가입")
    void signUpProcess(){
        //given
        String userEmail     = "test@naver.com";
        String userPwd       = "1234";
        String userName      = "테스트";
        String userPhone     = "01055555555";
        String userSocial    = "Home";
        String userState     = "활성";

        //when
        SignUpUserDto sd = new SignUpUserDto();
        sd.setUserEmail(userEmail);
        sd.setUserPwd(userPwd);
        sd.setUserName(userName);
        sd.setUserPhone(userPhone);
        sd.setUserSocial(userSocial);
        sd.setUserState(userState);

        //then
        int i = signUpService.userAccountIns(sd);

        Assertions.assertThat(i).isEqualTo(1);

    }

}














