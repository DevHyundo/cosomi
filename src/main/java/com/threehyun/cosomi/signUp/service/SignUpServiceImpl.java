package com.threehyun.cosomi.signUp.service;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import com.threehyun.cosomi.signUp.dao.SignUpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final SignUpMapper signUpMapper;

    /**이메일 중복 확인*/
    @Override
    public int userAccountDup(String userEmail) {
        return signUpMapper.userAccountDup(userEmail);
    }

    /**회원가입*/
    @Override
    public int userAccountIns(SignUpUserDto signUpUserDto) {
        return signUpMapper.userAccountIns(signUpUserDto);
    }


}
