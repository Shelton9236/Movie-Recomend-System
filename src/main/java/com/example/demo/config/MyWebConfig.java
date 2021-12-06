package com.example.demo.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 黄腾
 * @Date 2017/12/21-18:38
 * @function
 */
public class MyWebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/movieImg/**").addResourceLocations("file:D:/movie_rmc/");
        super.addResourceHandlers(registry);
    }

}
