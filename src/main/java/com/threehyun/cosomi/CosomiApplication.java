package com.threehyun.cosomi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.threehyun.cosomi.login.dao")
public class CosomiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosomiApplication.class, args);
	}

}
