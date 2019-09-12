package com.amer.demo.dal.dao;

import com.amer.demo.dal.entity.Cource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentDao {

    @Autowired
    EntityManager entityManager;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void saveStudentandPassport()
    {

    }

}
