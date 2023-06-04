package com.example.sql_dao_hibernate.repository;

import com.example.sql_dao_hibernate.entity.Persons;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@AllArgsConstructor
public class PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Persons> getPersonsByCity(String city){
        var query = entityManager.createQuery("select p from Persons p where lower(p.cityOfLiving) = lower(:city)", Persons.class);
        query.setParameter("city",city);
        return query.getResultList();

    }
}
