package com.lukesmvc.controller;

import com.lukesmvc.model.Person;
import com.lukesmvc.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by lyaegel on 08/20/2019
 */
@Controller
public class HelloController {
    @Autowired
    PersonServiceImpl personService;

    @GetMapping("/hello")
    public String hello() {

        personService.addPerson();

        return "hello";
    }

    @GetMapping("/hellotest")
    public String helloTest(){
        return "hello";
    }

}
