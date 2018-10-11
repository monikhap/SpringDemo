package com.spring.hibernate.SpringHibernateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SpringHibernateDemoApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringHibernateDemoApp.class, args);
    }
}
