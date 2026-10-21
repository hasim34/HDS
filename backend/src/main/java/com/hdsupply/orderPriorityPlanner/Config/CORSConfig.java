package com.hdsupply.orderPriorityPlanner.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration 
public class CORSConfig implements WebMvcConfigurer {
    public void addcorsMapping(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedMethods("POST","PUT","DELETE","GET")
                .allowedOrigins("http://localhost:5173");
    }
}
