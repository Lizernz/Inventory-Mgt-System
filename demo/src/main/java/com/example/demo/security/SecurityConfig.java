package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/public/**").permitAll()  // Example of allowing public access
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")  // Customize login page if needed
                .permitAll()
            )
            .httpBasic(httpBasic -> httpBasic.disable());  // Disable httpBasic if not needed

        return http.build();
    }
}
