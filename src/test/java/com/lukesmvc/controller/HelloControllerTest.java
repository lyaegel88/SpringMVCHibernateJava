package com.lukesmvc.controller;

import com.lukesmvc.services.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * Created by lyaegel on 09/30/2019
 */

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    @Mock
    PersonServiceImpl personService;

    @InjectMocks
    HelloController controller;

    @Test
    void helloTest(){
       assertEquals("hello", controller.helloTest());
    }

    @Test
    void hello(){
       assertEquals("hello", controller.hello());
       verify(personService).addPerson();
    }

}
