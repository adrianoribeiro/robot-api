package com.adrianoribeiro.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class Boot extends SpringBootServletInitializer implements WebApplicationInitializer {

   public static void main(String[] args)
   {
      SpringApplication.run(Boot.class, args);
   }
}
