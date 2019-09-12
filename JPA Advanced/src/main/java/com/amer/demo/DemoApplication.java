package com.amer.demo;

import com.amer.demo.dal.dao.CourceDao;
import com.amer.demo.dal.entity.Cource;
import com.amer.demo.dal.entity.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CourceDao courceDao;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Review> reviews = new ArrayList<>();
		Review review1 = new Review("WOW" , "5");
		Review review2 = new Review("Oh Yeah" , "4");

		reviews.add(review1);
		reviews.add(review2);

		courceDao.addReviewsForCourse(1001L , reviews);


	}
}
