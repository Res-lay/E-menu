package com.example.smartmenu.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


/**
Конфигурационный класс для настройки безопасности приложения.
Использует аннотации Spring Security для включения web-безопасности и метод-безопасности.
*/
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    /**
    Конфигурирует цепочку фильтров безопасности.
    @param security HttpSecurity объект, используемый для настройки безопасности.
    @return Цепочка фильтров безопасности.
    @throws Exception если произошла ошибка при настройке безопасности.
    */
    @Bean
    @SuppressWarnings("deprecation")
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception{
        security.cors().and().csrf().disable();
        // .authorizeRequests().anyRequest().permitAll();

        return security.build();
    }
    /**
    Конфигурирует объект CorsConfigurationSource для обработки CORS запросов.
    @return CorsConfigurationSource объект, настроенный для обработки CORS запросов.
    */
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:8081"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        configuration.setAllowedHeaders(Arrays.asList("content-type", "authorization"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);

        return source;
    }
 }
