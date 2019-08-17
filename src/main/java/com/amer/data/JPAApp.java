package com.amer.data;

import com.amer.data.dal.dao.PersonDaoJDBC;
import com.amer.data.dal.dao.PersonDaoJpa;
import com.amer.data.dal.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class JPAApp implements CommandLineRunner {

	@Autowired
	PersonDaoJpa personDaoJpa;
	//Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JPAApp.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		List<Person> personList = personDaoJpa.findAll();
//		personList.forEach(e-> System.out.println(e));

//		Person person = personDaoJpa.findById(1002);
//		//persons.forEach(e-> System.out.println(e));
//		System.out.println(person);

//		Person person = personDaoJpa.persistPerson(new Person("MMM" , "Cairo" , new Timestamp(25/5/2019)));
//		System.out.println(person);

//		Person person = personDaoJpa.updatePerson(new Person(1 , "SSS" , "Minya" ,new Timestamp(25/5/2019)) );
//		System.out.println(person);

		//personDaoJpa.deletePersonByID(1001);
		List<Person> allPerson = personDaoJpa.findAllPerson();
		allPerson.forEach(e-> System.out.println(e));

//		int num = personDao.deleteByID(1000);
//		System.out.println(num);

//		int num = personDao.persistPerson(new Person(5 , "Adel" , "Sharqia" , new Timestamp(25/5/2019)));
//		System.out.println(num);

//		int num = personDao.updatePerson(new Person(1000 , "Adhm" , "Sharqia" , new Timestamp(25/5/2019)));
//		System.out.println(num);
	}
}
