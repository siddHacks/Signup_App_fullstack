package com.form.signup;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/signup/add-details") // Specify the endpoint you want to enable CORS for
                .allowedOrigins("http://127.0.0.1:5500") // Whitelist the origin
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
