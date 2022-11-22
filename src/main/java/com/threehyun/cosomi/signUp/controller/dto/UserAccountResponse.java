package com.threehyun.cosomi.signUp.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountResponse {

    /**
     * @comment 성공여부
     */
    private boolean completed = true;

    /**
     * @comment 사용자에게 보여주는 메시지
     */
    private String message;

    /**
     * @comment 에러메시지
     */
    private String errorMessage;

    /**
     * @comment 결과값
     */
    private Object result;

    /**
     * @comment 상태값
     */
    private HttpStatus httpStatus;
}
