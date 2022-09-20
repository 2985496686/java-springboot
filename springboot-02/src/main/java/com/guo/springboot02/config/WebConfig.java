package com.guo.springboot02.config;

import com.guo.springboot02.entity.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Pet>() {
                    @Override
                    public Pet convert(String source) {
                       if(source != null && source.length()!=0){
                           String[] strings = source.split(",");
                           Pet pet = new Pet();
                           pet.setName(strings[0]);
                           pet.setWeight(Double.parseDouble(strings[1]));
                           return pet;
                       }
                       return null;
                    }
                });
            }
        };
    }
}
