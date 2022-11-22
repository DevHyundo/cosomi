package com.threehyun.cosomi.signUp.service;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import com.threehyun.cosomi.signUp.dao.SignUpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final SignUpMapper signUpMapper;

    /**
     * 사용자 > 회원가입 > 중복확인
     * @param {signUpUserDto}
     * @return {int}
     * */
    @Override
    public int userAccountDupCheck(String userEmail) {
        return signUpMapper.userAccountDupCheck(userEmail);
    }


    /**
     * 사용자 > 회원가입
     * @param {signUpUserDto}
     * @return {int}
     * */
    @Override
    public int userAccountIns(SignUpUserDto signUpUserDto) {
        return signUpMapper.userAccountIns(signUpUserDto);
    }


}
