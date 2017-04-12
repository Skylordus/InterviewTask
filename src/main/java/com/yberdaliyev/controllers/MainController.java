package com.yberdaliyev.controllers;

import com.yberdaliyev.models.pojos.Person;
import com.yberdaliyev.services.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Yerlan on 25.02.2017.
 */
@Controller
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);
    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/list")
    public ModelAndView listPeople(HttpServletRequest request, HttpSession session)  {
        logger.trace("On MainController.listPeople() :");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("showList",true);

        List<Person> personList = personService.getListOfPeople();
        modelAndView.addObject("people",personList);

        return modelAndView;
    }


    @GetMapping("/")
    public ModelAndView showIndex( )  {
        logger.trace("On MainController.showIndex() :");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("showList",null);
        return modelAndView;
    }

    @GetMapping("/info")
    public ModelAndView showInfo(@RequestParam(name = "id") Long id)  {
        logger.trace("On MainController.showIndex() :");
        ModelAndView modelAndView = new ModelAndView("information");
        Person person = personService.getPersonById(id);
        Date date = person.getDob();
        logger.warn("DOB: "+date);
        modelAndView.addObject("person",person);
        return modelAndView;
    }

}
