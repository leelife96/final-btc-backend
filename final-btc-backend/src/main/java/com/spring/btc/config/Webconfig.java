package com.spring.btc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://localhost:9000", "http://3.34.231.185") // 프론트엔드 URL로 수정
				.allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
	}
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//	    registry.addMapping("/**")
//	            .allowedOrigins("*") // 프론트엔드 서버 URL로 변경
//	            .allowedMethods("GET", "POST", "PUT", "DELETE")
//	            .allowedHeaders("*")
//	            .allowCredentials(true);
//	}

}
