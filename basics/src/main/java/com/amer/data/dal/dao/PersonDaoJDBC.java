package com.amer.data.dal.dao;

import com.amer.data.dal.mappers.PersonMapper;
import com.amer.data.dal.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonDaoJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Select * from Person
    public List<Person> findAll()
    {
        String sql = "select * from person";
        return jdbcTemplate.query(sql, new PersonMapper());
    }

    public Person findById(int id)
    {
        String sql = "SELECT * FROM person WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id} , new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteByID(int id)
    {
        String sql ="DELETE FROM person WHERE id = ?";
        Object[] args = new Object[]{id};
        return jdbcTemplate.update(sql,args);
    }

    public int persistPerson(Person person)
    {
        String sql = "insert into person values(?,?,?,?)";
        Object[]args = new Object[]{person.getId() , person.getName() , person.getLocation() , new Timestamp(person.getBirth_date().getTime())};
        return jdbcTemplate.update(sql , args);
    }

    public int updatePerson(Person person)
    {
        String sql = "update person"+ " set name = ?  , location = ? , birth_date = ? where id = ?";
        Object[] args = new Object[]{person.getName() , person.getLocation() , new Timestamp(person.getBirth_date().getTime()) , person.getId()};
        return jdbcTemplate.update(sql , args);
    }
}
