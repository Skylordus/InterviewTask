package com.yberdaliyev.models.pojos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Yerlan on 12.04.2017.
 */
@XmlRootElement(name = "people")
public class People {
    private ArrayList<Person> listOfPeople;

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }

    @XmlElement(name = "person")
    public void setListOfPeople(ArrayList<Person> listOfPeople) {
        this.listOfPeople = listOfPeople;
    }
}
