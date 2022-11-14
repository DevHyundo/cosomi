package com.threehyun.cosomi.login.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    public HttpStatus httpStatus;
    public String message;
    public TempUser user;

}
