package com.amer.data;

import com.amer.data.dal.dao.PersonDaoJDBC;
import com.amer.data.dal.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

//@SpringBootApplication
public class JDBCApp implements CommandLineRunner {

	@Autowired
	PersonDaoJDBC personDaoJDBC;
	//Logger logger = LoggerFactory.getLogger(this.getClass());

//	public static void main(String[] args) {
//		SpringApplication.run(JDBCApp.class, args);
//	}


	@Override
	public void run(String... args) throws Exception {

		List<Person> personList = personDaoJDBC.findAll();
		personList.forEach(e-> System.out.println(e));

//		Person person = personDao.findById(1000);
//		//persons.forEach(e-> System.out.println(e));
//		System.out.println(person);

//		int num = personDao.deleteByID(1000);
//		System.out.println(num);

//		int num = personDao.persistPerson(new Person(5 , "Adel" , "Sharqia" , new Timestamp(25/5/2019)));
//		System.out.println(num);

//		int num = personDao.updatePerson(new Person(1000 , "Adhm" , "Sharqia" , new Timestamp(25/5/2019)));
//		System.out.println(num);
	}
}
