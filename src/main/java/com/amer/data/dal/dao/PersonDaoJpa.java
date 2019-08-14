package com.amer.data.dal.dao;

import com.amer.data.dal.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDaoJpa {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id)
    {
        return entityManager.find(Person.class , id);
    }

}
