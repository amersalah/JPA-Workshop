package com.amer.data.dal.mappers;

import com.amer.data.dal.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setLocation(resultSet.getString("location"));
        person.setBirth_date(resultSet.getTimestamp("birth_date"));
        return person;
    }
}
