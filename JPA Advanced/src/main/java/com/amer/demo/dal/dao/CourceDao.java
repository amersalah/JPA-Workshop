package com.amer.demo.dal.dao;

import com.amer.demo.dal.entity.Cource;
import com.amer.demo.dal.entity.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

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
        Cource cource1 = new Cource("Web Service");
        entityManager.persist(cource1);
        entityManager.flush();

        Cource cource2 = findByID(1001L);
        cource2.setName("Amer Salah");

//        Cource cource2 = new Cource("Angular");
//        entityManager.persist(cource2);
//        entityManager.flush();
//        //entityManager.detach(cource2); //the Object Cource2 is no longer tracked by EntityManager
//        //entityManager.clear();         // The Entity Manager is no longer track Any Object.
//        cource1.setName("WebService-updated");
//        cource2.setName("Angular-updated");
//        entityManager.refresh(cource1);//it will get the data of Course 1  from the database and assign it to Cource 1 then updated will not be approved.
//        //entityManager.flush();
    }

    public void addReviewsForCourse(Long id , List<Review> reviews)
    {
        Cource cource = findByID(id);

        logger.info("Cource Reviews are  -> {}" , cource.getReviews());

        for (Review review:reviews) {
            cource.addReview(review);
            review.setCource(cource);
            entityManager.persist(review);
        }
    }

}
