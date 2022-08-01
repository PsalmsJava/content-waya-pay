package com.contentwaya.pay.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurityConfig {

    private static final String [] WHITE_LIST_URLS = {
            "/login",
            "/register",
            "/verify-token*",
            "/resend-token*"};
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(15);
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity. cors().and().csrf().disable()
                .authorizeHttpRequests()
                .antMatchers(WHITE_LIST_URLS).permitAll();
        return  httpSecurity.build();
    }
}
