package com.yberdaliyev.DAO;

import com.yberdaliyev.models.pojos.People;
import com.yberdaliyev.models.pojos.Person;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yerlan on 12.04.2017.
 */
@Repository
public class PersonDAOImpl implements PersonDAO {
    private List<Person> personList;

    @Override
    public List<Person> getAll() {

        try {

            File file = new File("/spisok.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            People people = (People) jaxbUnmarshaller.unmarshal(file);
            personList=people.getListOfPeople();
            return personList;
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Person getById(Long id) {
        List<Person> list = (personList==null)?getAll():personList;
        for (Person person : list) {
            if (person.getId().equals(id)) return person;
        }
        return null;
    }
}
