package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.signUp.dao.SignUpMapper;
import com.threehyun.cosomi.signUp.service.SignUpService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

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

    }

}
