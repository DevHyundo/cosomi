package com.threehyun.cosomi.signUp.controller.dto;

import lombok.Data;
import java.util.Date;

@Data
public class SignUpUserDto {

    int userSeq;
    String userEmail;
    String userPwd;
    String userName;
    String userPhone;
    Date userRegDateTime;
    String userSocial;
    String userState;

}
