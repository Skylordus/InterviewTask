package com.yberdaliyev.DAO;

import com.yberdaliyev.models.pojos.Person;

import java.util.List;

/**
 * Created by Yerlan on 12.04.2017.
 */
public interface PersonDAO {
    List<Person> getAll();
    Person getById(Long id);
}
