package com.yberdaliyev.models.pojos;

import com.yberdaliyev.models.adapters.DateAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by Yerlan on 12.04.2017.
 */
@XmlRootElement
public class Person {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private Date dob;
    private Double height;
    private Double weight;
    private String gender;

    public Person() {}
    public Person(Long id, String name, String surname, String patronymic, Date dob, Double height, Double weight, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    @XmlElement
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @XmlElement
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @XmlElement
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDob() {
        return dob;
    }

    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Double getHeight() {
        return height;
    }

    @XmlElement
    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    @XmlElement
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob=" + dob +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
