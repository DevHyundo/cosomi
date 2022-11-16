package com.threehyun.cosomi.signUp.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignUpMapper {

    int userAccountDup(String signUpUserDto);

}
