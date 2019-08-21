package com.lukesmvc.controller;

import com.lukesmvc.model.Person;
import com.lukesmvc.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lyaegel on 08/21/2019
 */
@RestController
public class PersonController {

    @Autowired
    PersonServiceImpl personService;

    @GetMapping(value = "/people")
    public List<Person> getPeople(){
     return personService.listPeople();
    }


}
