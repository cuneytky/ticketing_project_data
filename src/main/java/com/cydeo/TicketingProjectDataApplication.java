package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication  // this includes @Configuration
public class TicketingProjectDataApplication {

    public static void main(String[] args) {

        SpringApplication.run(TicketingProjectDataApplication.class, args);
    }
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
/*  I am trying to add bean in the container thru @Bean annotation

 1- Create a class annotated with @Configuration
    @Spring... altına annotation ekleyerek - bu olmadı
 2- Write a method which return the object that you trying to add in the container
     ModelMapper mapper = new ModelMapper();
     public ModelMapper mapper(){
         return new ModelMapper();
    }
 3- Annotate this method with @Bean

    @Bean
    public ModelMapper mapper(){
         return new ModelMapper();
    }

 */