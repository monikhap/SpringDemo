package com.springhibernate.jpa.SpringHibernateJPADemo;

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
