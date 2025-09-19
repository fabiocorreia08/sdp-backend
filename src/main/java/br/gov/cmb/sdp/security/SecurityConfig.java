package br.gov.cmb.sdp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // desabilita CSRF no formato novo
            .csrf(AbstractHttpConfigurer::disable)
            
            // define as autorizações
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/public/**").permitAll() // libera alguns endpoints
                .anyRequest().authenticated()
            )
            
            // autenticação básica para Postman
            .httpBasic();

        return http.build();
    }
}


