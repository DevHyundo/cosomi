package com.threehyun.cosomi.signUp.dao;

import com.threehyun.cosomi.signUp.controller.dto.SignUpUserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {

    int userAccountDup(String signUpUserDto);

    int userAccountIns(SignUpUserDto signUpUserDto);

}
