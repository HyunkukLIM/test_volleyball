package com.sports2i.test_volleyball.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	
	 @Bean 
	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	      
	        http
	        .csrf().disable() //csrf 토큰 비활성화 (테스트시 걸어두는게 좋음)
	        
	        .authorizeRequests()
	        .antMatchers("/","/auth/**","/js/**","/css/**", "/images/**", "/api/play/**").permitAll()
	            .anyRequest()
	            .authenticated()
	        
	        .and()
	           .formLogin()
	           .loginPage("/auth/loginForm")
	           .loginProcessingUrl("/auth/loginProc") //스프링 시큐리티가 로그인을 가로챈다.
	       .defaultSuccessUrl("/play/inputForm"); //정상적으로 요청이 완료       
	        return http.build();
	    }
}
