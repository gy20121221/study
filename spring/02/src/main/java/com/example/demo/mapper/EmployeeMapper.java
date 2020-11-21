package com.example.demo.mapper;

import com.example.demo.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
