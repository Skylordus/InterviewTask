package com.yberdaliyev.services;

import com.yberdaliyev.models.pojos.Person;

import java.util.List;

/**
 * Created by Yerlan on 12.04.2017.
 */
public interface PersonService {
    List<Person> getListOfPeople();
    Person getPersonById(Long id);
}
