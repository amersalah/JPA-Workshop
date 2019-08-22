package com.amer.demo;

import com.amer.demo.dal.dao.CourceDao;
import com.amer.demo.dal.entity.Cource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		//Find By ID
	//Cource cource = courceDao.findByID(1001L);
	//logger.info("Cource with id 1001 is {}" , cource);

		//Delete By ID
		//courceDao.deleteByID(1001L);

		//Save Cource
//		Cource cource = courceDao.saveOrupdateCource(new Cource("Hellllo"));
//		logger.info("The New Added Cource is {}" , cource);

		//playing with Entity Manager
		courceDao.playWithEntityManager();
	}
}
