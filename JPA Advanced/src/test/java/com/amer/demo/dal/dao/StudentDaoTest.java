package com.amer.demo.dal.dao;

import com.amer.demo.DemoApplication;
import com.amer.demo.dal.entity.Cource;
import com.amer.demo.dal.entity.Passport;
import com.amer.demo.dal.entity.Student;
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
public class StudentDaoTest {

	//in Hibernate Session = Persistence Context
	//Dirties Context used to rollback data as before testing changing.


	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	@Transactional
	public void retriveStudentAndPassport()
	{
		Student student = em.find(Student.class , 20001L);
		logger.info("Student Details is  -> {}" , student);
	}

	@Test
	@Transactional
	public void retrivePassportAndAssociatedStudent()
	{
		Passport passport = em.find(Passport.class , 40001L);
		logger.info("Passport Details is  -> {}" ,passport);
		logger.info("Student Details is ->  {}" , passport.getStudent());
	}




	@Test
	@Transactional
	public void someTest()
	{
		Student student = em.find(Student.class , 20001L);
		Passport passport = student.getPassport();
		passport.setNumber("XX12345");
		student.setName("Amer-updated");
	}

}
