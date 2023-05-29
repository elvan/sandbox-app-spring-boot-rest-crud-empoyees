package com.example.sandbox.dao;

import com.example.sandbox.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
