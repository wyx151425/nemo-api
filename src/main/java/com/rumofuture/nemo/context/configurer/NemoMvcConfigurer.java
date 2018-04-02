package com.rumofuture.nemo.context.configurer;

import com.rumofuture.nemo.context.interceptor.NemoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class NemoMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new NemoInterceptor())
                .addPathPatterns("/users/**")
                .addPathPatterns("/books/**")
                .addPathPatterns("/pages/**");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
