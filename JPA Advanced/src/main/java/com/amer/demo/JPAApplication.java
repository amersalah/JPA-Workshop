package com.amer.demo;


import com.amer.demo.dal.dao.StudentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JPAApplication implements CommandLineRunner {

	@Autowired
	StudentDao studentDao;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
