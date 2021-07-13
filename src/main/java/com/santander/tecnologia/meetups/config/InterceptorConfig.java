package com.santander.tecnologia.meetups.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.santander.tecnologia.meetups.interceptor.Interceptor;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Bean
    public Interceptor defaultInterceptor() {
	return new Interceptor();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowCredentials(true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(defaultInterceptor()).excludePathPatterns("/swagger-ui.html", "/swagger-ui.html/**",
		"/swagger-resources/**", "/webjars/springfox-swagger-ui/**", "/error", "/token");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
