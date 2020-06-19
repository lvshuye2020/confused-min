package com.confused.min.config;

import com.confused.min.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${person.sex}")
    private String sex;

    @Bean
    public Person getPerson(){
        Person person = new Person(name,age,sex);
        return person;
    }

}
