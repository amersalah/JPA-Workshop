package com.amer.demo.dal.dao;

import com.amer.demo.dal.entity.Cource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourceDao {

    @Autowired
    EntityManager entityManager;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //Find Cource By ID
    public Cource findByID(Long id)
    {
        Cource cource =  entityManager.find(Cource.class , id);
        return cource;
    }

    //Persist Cource to DB
    public Cource saveOrupdateCource(Cource cource)
    {
        return entityManager.merge(cource);
    }

    //Delete Cource By ID
    public void deleteByID(Long id)
    {
        Cource cource = findByID(id);
        if(cource != null)
            entityManager.remove(cource);
    }

    public void playWithEntityManager()
    {
        Cource cource = new Cource("JavaFX");
        entityManager.persist(cource);
        cource.setName("JavaFX-updated");
    }

}
