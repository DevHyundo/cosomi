package com.threehyun.cosomi.login.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class TempUser {

    Integer USER_SEQ;
    String USER_EMAIL;
    String USER_PWD;
    String USER_NAME;
    String USER_PHONE;
    Date USER_REGDATE;
    String USER_SOCIAL;
    String USER_STATE;
}
