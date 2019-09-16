package com.amer.demo.dal.dao;

import com.amer.demo.dal.entity.Cource;
import com.amer.demo.dal.entity.Employee;
import com.amer.demo.dal.entity.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeDao {

    @Autowired
    EntityManager entityManager;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //insert an Employee

    public void insertEmployee(Employee employee)
    {
        entityManager.persist(employee);
    }

    //retrieve All Employees

    public List<Employee> getAllPartTimeEmployees()
    {
        return entityManager.createQuery("select e from PartTimeEmployee e").getResultList();
    }


    public List<Employee> getAllFullTimeEmployees()
    {
        return entityManager.createQuery("select e from FullTimeEmployee e").getResultList();
    }


}
