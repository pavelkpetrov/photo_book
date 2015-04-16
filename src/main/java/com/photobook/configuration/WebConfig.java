package com.photobook.configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by pavel on 16.04.2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.photobook")
public class WebConfig extends WebMvcConfigurerAdapter {

    private List<HttpMessageConverter<?>> messageConverters;

    @Bean
    public ViewResolver viewResolver() {
        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public MessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("utf-8");
        return messageSource;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        // Note: this overwrites the default message converters.
        converters.addAll(getMessageConverters());
    }

    /**
     * The message converters for the content types we support.
     *
     * @return the message converters; returns the same list on subsequent calls
     */
    private List<HttpMessageConverter<?>> getMessageConverters() {
        if (messageConverters == null) {
            messageConverters = new ArrayList<HttpMessageConverter<?>>();
            messageConverters.add(jsonConverter());
        }
        return messageConverters;
    }

    @Bean
    public ObjectMapper jacksonObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public MappingJackson2HttpMessageConverter jsonConverter() {
        MappingJackson2HttpMessageConverter jacksonConverter = new
                MappingJackson2HttpMessageConverter();
        jacksonConverter.setSupportedMediaTypes(Arrays.asList(MediaType.valueOf("application/json")));
        jacksonConverter.setObjectMapper(jacksonObjectMapper());
        return jacksonConverter;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("/images/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("/js/");
        registry.addResourceHandler("/styles/**")
                .addResourceLocations("/styles/");
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("/templates/");
    }

}