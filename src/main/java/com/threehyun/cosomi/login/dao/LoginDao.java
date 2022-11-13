package com.threehyun.cosomi.login.dao;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {

    TempUser findUserByEmailPwd(LoginProcessDto loginProcessDto);

}
