package com.example.sql_dao_hibernate.controller;
import com.example.sql_dao_hibernate.entity.Persons;
import com.example.sql_dao_hibernate.repository.PersonsCrudRepository;
import com.example.sql_dao_hibernate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService, PersonsCrudRepository personsRepository) {
        this.personService = personService;
    }

    @GetMapping("/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return personService.getPersonByCity(city);
    }

    @GetMapping("/by-age")
    public List<Persons> getPersonsByAge(@RequestParam int age) {
        return personService.getPersonByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return personService.getPersonByNameAndSurname(name, surname);
    }
}
