package com.threehyun.cosomi.signUp.service;

import com.threehyun.cosomi.signUp.dao.SignUpMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl extends SignUpService{

    private final SignUpMapper signUpMapper;

    @Override
    public int userAccountDup(String userEmail) {
        return signUpMapper.userAccountDup(userEmail);
    }
}
