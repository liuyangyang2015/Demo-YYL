package com.bigroad.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebAppConfigurerAdapter extends WebMvcConfigurerAdapter
{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SyslogInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/api/**", "/error");
    }
}
