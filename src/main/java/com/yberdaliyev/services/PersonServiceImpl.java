package com.yberdaliyev.services;

import com.yberdaliyev.DAO.PersonDAO;
import com.yberdaliyev.models.pojos.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yerlan on 12.04.2017.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    @Autowired
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public List<Person> getListOfPeople() {
        return personDAO.getAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personDAO.getById(id);
    }
}
