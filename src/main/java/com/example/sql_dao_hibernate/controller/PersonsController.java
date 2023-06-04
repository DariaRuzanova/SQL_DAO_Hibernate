package com.example.sql_dao_hibernate.controller;

import com.example.sql_dao_hibernate.entity.Persons;
import com.example.sql_dao_hibernate.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {
    private final PersonsRepository personsRepository;

    public PersonsController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }
}
