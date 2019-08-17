package com.amer.data.dal.dao;

import com.amer.data.dal.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

    public Person persistPerson(Person person)
    {
        return entityManager.merge(person);
    }

    public Person updatePerson(Person person)
    {
        return entityManager.merge(person);
    }

    public void deletePersonByID(int id)
    {
        Person person = findById(id);
        entityManager.remove(person);
    }

    public List<Person> findAllPerson()
    {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find-all-persons", Person.class);
        return namedQuery.getResultList();
    }
}
