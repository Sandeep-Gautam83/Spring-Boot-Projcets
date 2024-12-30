package com.core.concepts;


import com.core.college.Teacher;
import com.core.qualifier.Human;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.core"})
public class ConfigClass {

    @Bean(name = "teacher")
    public Teacher getTeacher() {
        return new Teacher();

    }

    
}
