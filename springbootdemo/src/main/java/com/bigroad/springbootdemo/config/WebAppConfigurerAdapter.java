package com.bigroad.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebAppConfigurerAdapter extends WebMvcConfigurationSupport
{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SyslogInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/**", "/error");
        registry.addInterceptor(new Interceptor2()).addPathPatterns("/**").excludePathPatterns("/api/**", "/error");
        registry.addInterceptor(new Interceptor3()).addPathPatterns("/**").excludePathPatterns("/api/**", "/error");
        registry.addInterceptor(new Interceptor4()).addPathPatterns("/**").excludePathPatterns("/api/**", "/error");
    }
}
