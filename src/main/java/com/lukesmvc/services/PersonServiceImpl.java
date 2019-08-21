package com.lukesmvc.services;

import com.lukesmvc.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by lyaegel on 08/20/2019
 */
@Service
@Transactional
public class PersonServiceImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Person> listPeople(){
        @SuppressWarnings("unchecked")
        TypedQuery<Person> query = sessionFactory.getCurrentSession().createQuery("FROM Person");
        return query.getResultList();
    }

    public void addPerson(){
        Person person = new Person();
        person.setFirstName("Abraham");
        person.setLastName("Lincoln");

        sessionFactory.getCurrentSession().save(person);
    }


}
