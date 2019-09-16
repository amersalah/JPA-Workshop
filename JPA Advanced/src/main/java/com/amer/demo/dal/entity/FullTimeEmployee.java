package com.amer.demo.dal.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class FullTimeEmployee extends Employee{


    //Single Table Option for Inheritance the benefit is that all data in one table and performance is good but alot of null exists.

    private BigDecimal salary;

    public FullTimeEmployee(){}

    public FullTimeEmployee(String name , BigDecimal salary)
    {
        super(name);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "salary=" + salary +
                '}';
    }

}
