package com.threehyun.cosomi.login.controller;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.LoginResponse;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import com.threehyun.cosomi.login.service.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginServiceImpl loginService;

    @GetMapping("/login")
    public String getLoginPage(){
        return "login/loginPage.html";
    }

    @GetMapping("/login/confirm-process")
    public ResponseEntity<LoginResponse> getLoginProcess(LoginProcessDto loginProcessDto){
        LoginResponse loginResponse = new LoginResponse();
        TempUser resultUser = loginService.login(loginProcessDto);
        if(resultUser==null){
            loginResponse = LoginResponse.builder()
                    .httpStatus(HttpStatus.NOT_FOUND)
                    .message("아이디 또는 비밀번호가 일치하지 않습니다.")
                    .user(null).build();
        }else{
            loginResponse = LoginResponse.builder()
                    .httpStatus(HttpStatus.OK)
                    .message("로그인 성공.")
                    .user(resultUser).build();
        }
        return new ResponseEntity<LoginResponse>(loginResponse, loginResponse.getHttpStatus());
    }

}
