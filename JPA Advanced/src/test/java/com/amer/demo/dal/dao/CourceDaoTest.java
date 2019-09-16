package com.amer.demo.dal.dao;

import com.amer.demo.DemoApplication;
import com.amer.demo.dal.entity.Cource;
import com.amer.demo.dal.entity.Review;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourceDaoTest {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourceDao courceDao;

	@Autowired
	EntityManager em;


	@Test
	//@Transactional
	public void getReviewsForCource()
	{
		Cource cource = courceDao.findByID(1001L);
		logger.info("Cource Reviews are -> {}" , cource.getReviews());
	}

	@Test
	//@Transactional
	public void getCourceForReview()
	{
		Review review = em.find(Review.class,50001L);
		logger.info("Cource Reviews are -> {}" , review.getCource());
	}
}
