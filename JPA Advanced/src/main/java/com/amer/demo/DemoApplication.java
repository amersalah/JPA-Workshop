package com.amer.demo;

import com.amer.demo.dal.dao.CourceDao;
import com.amer.demo.dal.dao.EmployeeDao;
import com.amer.demo.dal.dao.StudentDao;
import com.amer.demo.dal.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CourceDao courceDao;

	@Autowired
	StudentDao studentDao;

	@Autowired
	EmployeeDao employeeDao;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<Review> reviews = new ArrayList<>();
//		Review review1 = new Review("WOW" , "5");
//		Review review2 = new Review("Oh Yeah" , "4");
//
//		reviews.add(review1);
//		reviews.add(review2);
//
//		courceDao.addReviewsForCourse(1001L , reviews);


		//studentDao.insertStudentAndCource();

		employeeDao.insertEmployee(new FullTimeEmployee("Ismail" , new BigDecimal("5000")));

		employeeDao.insertEmployee(new PartTimeEmployee("Wahsh" , new BigDecimal("10000")));

		logger.info("All Full Time Employess are -> {}" , employeeDao.getAllFullTimeEmployees());

		logger.info("All Part Time Employess are -> {}" , employeeDao.getAllPartTimeEmployees());

	}
}
