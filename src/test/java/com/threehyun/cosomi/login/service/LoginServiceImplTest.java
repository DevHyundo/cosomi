package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import com.threehyun.cosomi.login.dao.LoginMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

//@MybatisTest
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class LoginServiceImplTest {

    /**
     * [기존 어노테이션 조합]
     *  -@MybatisTest + @AutoConfigureTestDatabase
     *  결과 : Unsatisfied dependency expressed through field 오류.
     *
     * [게더 종료 후 시도 했던 흐름]
     * 1. @MybatisTest + @SpringBootTest + @AutoConfigureTestDatabase
     *  결과 : 중복 configuration error: found multiple declarations 오류.
     *  따라서, 아~ test 어노테이션 2개 넣으면 안되겠다 싶어서 이번엔 MybatisTest 를 지웠습니다.
     *
     * 2. @SpringBootTest + @AutoConfigureTestDatabase
     *  결과 : 테스트 성공
     *  성공이유 : 대체 왜 ? 그럼 MybatisTest 어노테이션만 있을 땐 왜 안되었던 걸까?
     * */

    @Autowired LoginMapper loginMapper;
    @Autowired LoginServiceImpl loginService;

    @Test
    @DisplayName("비밀번호 암호화 테스트")
    void encodePwd() {
        // given
        LoginProcessDto loginProcessDto = new LoginProcessDto();
        loginProcessDto.setEmail("Hello@naver.com");
        loginProcessDto.setPwd("12345");

        // when
        //LoginService loginService = new LoginServiceImpl(loginMapper);

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
        TempUser resultUser = loginService.login(target);

        // t
        System.out.println(resultUser.getUSER_EMAIL());
        Assertions.assertThat(target.getEmail()).isEqualTo(resultUser.getUSER_EMAIL());

    }
}