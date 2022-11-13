package com.threehyun.cosomi.login.controller;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import com.threehyun.cosomi.login.service.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
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
    public void getLoginProcess(LoginProcessDto loginProcessDto){
        TempUser user = loginService.login(loginProcessDto);
        System.out.println("logincontroller.class user = " + user.getUSER_EMAIL());
    }
}
