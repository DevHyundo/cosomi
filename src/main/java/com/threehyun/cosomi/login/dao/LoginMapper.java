package com.threehyun.cosomi.login.dao;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface LoginMapper {

    TempUser findUserByEmailPwd(LoginProcessDto loginProcessDto);

}
