package com.confused.min.web;

import com.confused.min.entity.Person;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private Person person;

    @org.junit.Test
    public void test1(){
        System.out.println(person);
    }
}
