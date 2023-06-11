package com.example.sql_dao_hibernate.repository;

import com.example.sql_dao_hibernate.entity.PersonKey;
import com.example.sql_dao_hibernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsCrudRepository extends JpaRepository<Persons, PersonKey> {
    List<Persons> findAllByCityOfLiving(String cityOfLiving);

    List<Persons> findByPersonKey_AgeIsLessThanOrderByPersonKeyAgeAsc(int age);

    Optional<Persons> findByPersonKey_NameAndPersonKey_Surname(String name, String surname);
}

