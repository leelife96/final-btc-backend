package com.spring.btc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.btc.mapper") // MyBatis 매퍼 인터페이스가 위치한 패키지 경로
public class FinalBtcBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalBtcBackendApplication.class, args);
	}

}
