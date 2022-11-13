package com.threehyun.cosomi.login.service;

import com.threehyun.cosomi.login.controller.dto.LoginProcessDto;
import com.threehyun.cosomi.login.controller.dto.TempUser;
import com.threehyun.cosomi.login.dao.LoginMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService{

    private final LoginMapper loginMapper;

    @Override
    public TempUser login(LoginProcessDto loginProcessDto) {
        loginProcessDto.setPwd(encodingPwdToHash(loginProcessDto.getPwd()));
        TempUser user = loginMapper.findUserByEmailPwd(loginProcessDto);
        return user;
    }


    private String encodingPwdToHash(String pwd){
        String encodedPwd = "";
        try {
            MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");

            String saltedPwd = pwd+"threeHyuns";
            mdSHA256.update(saltedPwd.getBytes(StandardCharsets.UTF_8));

            // 바이트 배열로 해쉬를 반환한다.
            byte[] sha256Hash = mdSHA256.digest();

            // StringBuffer 객체는 계속해서 append를 해도 객체는 오직 하나만 생성된다. => 메모리 낭비 개선
            StringBuffer hexSHA256hash = new StringBuffer();

            // 256비트로 생성 => 32Byte => 1Byte(8bit) => 16진수 2자리로 변환 => 16진수 한 자리는 4bit
            for(byte b : sha256Hash) {
                String hexString = String.format("%02x", b);
                hexSHA256hash.append(hexString);
            }
            encodedPwd = hexSHA256hash.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encodedPwd;
    }
}
