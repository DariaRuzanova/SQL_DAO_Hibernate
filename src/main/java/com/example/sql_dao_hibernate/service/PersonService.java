package com.example.sql_dao_hibernate.service;

import com.example.sql_dao_hibernate.entity.Persons;
import com.example.sql_dao_hibernate.repository.PersonsCrudRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class PersonService {
    private final PersonsCrudRepository personsCrudRepository;


    @Autowired
    public PersonService(PersonsCrudRepository personsCrudRepository) {
        this.personsCrudRepository = personsCrudRepository;
    }

    public List<Persons> getPersonByCity(String city) {
        return personsCrudRepository.findAllByCityOfLiving(city);
    }

    public List<Persons> getPersonByAge(int age) {
        return personsCrudRepository.findByPersonKey_AgeIsLessThanOrderByPersonKeyAgeAsc(age);
    }

    public Optional<Persons> getPersonByNameAndSurname(String name, String surname) {
        return personsCrudRepository.findByPersonKey_NameAndPersonKey_Surname(name, surname);
    }
}
