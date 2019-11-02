package com.atguigu.gmall.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GmallCorsConfig
{
    @Bean
    public CorsWebFilter corsWebFilter()
    {
        // CORS配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:1000"); //允许哪些域名可以跨域请求
        corsConfiguration.addAllowedHeader("*"); //允许跨域请求携带的头信息
        corsConfiguration.addAllowedMethod("*"); //允许跨域请求的方法
        corsConfiguration.setAllowCredentials(true); //是否允许携带cookie信息

        // cors配置源
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();

        configurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(configurationSource);
    }
}

























