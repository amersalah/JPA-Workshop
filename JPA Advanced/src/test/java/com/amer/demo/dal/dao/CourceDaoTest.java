package com.amer.demo.dal.dao;

import com.amer.demo.DemoApplication;
import com.amer.demo.dal.entity.Cource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourceDaoTest {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourceDao courceDao;

	@Test
	public void findByIDTest() {
		Cource cource = courceDao.findByID(1001L);
		Assert.assertEquals("Hibernate" , cource.getName());
		logger.info("Running Test Now");
	}

	@Test
	@DirtiesContext
	public void deleteByIDTest() {
		courceDao.deleteByID(1002L);
		Assert.assertNull(courceDao.findByID(1002L));
	}

	@Test
	public void saveCourceTest()
	{
		Cource cource = courceDao.saveOrupdateCource(new Cource("hhhhhh"));
		Assert.assertEquals("hhhhhh" , cource.getName());
	}

	@Test
	@DirtiesContext
	public void playWithEntityManagerTest()
	{
		courceDao.playWithEntityManager();
	}
}
