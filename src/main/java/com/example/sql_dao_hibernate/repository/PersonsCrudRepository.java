package com.example.sql_dao_hibernate.repository;

import com.example.sql_dao_hibernate.entity.PersonKey;
import com.example.sql_dao_hibernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsCrudRepository extends JpaRepository<Persons, PersonKey> {
    @Query("select p from Persons p where p.cityOfLiving=:city")
    List<Persons> findCityOfLiving(@Param("city") String city);

    @Query("select p from Persons p where p.personKey.age<:age order by p.personKey.age")
    List<Persons> findByAge(@Param("age") int age);

    @Query("select p from Persons p where p.personKey.name =:name and p.personKey.surname=:surname")
    Optional<Persons> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}

