package com.ken.tutorial.twitterclone.sample.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.ken.tutorial.twitterclone")
public class WebMvcConfig {
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/resources/jsps/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
