package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import org.springframework.stereotype.Service;

public interface LoginService {

    public TempUser login(LoginProcessDto loginProcessDto);
}
