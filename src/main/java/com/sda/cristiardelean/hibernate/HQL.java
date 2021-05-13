package com.sda.cristiardelean.hibernate;

import com.sda.cristiardelean.hibernate.model.Department;
import com.sda.cristiardelean.hibernate.model.Employee;
import com.sda.cristiardelean.hibernate.repository.DepartmentRepository;
import com.sda.cristiardelean.hibernate.repository.EmployeeRepository;

import java.sql.Date;

public class HQL {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department1 = new Department();
        department1.setName("Finance");
        departmentRepository.save(department1);
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee1 = new Employee();
        employee1.setFirstName("Mircea");
        employee1.setLastName("Popa");
        employee1.setEmail("jgfuf@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744128986");
        employee1.setSalary(5000);

        employee1.setDepartment(department1);
        employeeRepository.save(employee1);
        employeeRepository.findAllEmployeesFromDepartment("FinanceY").forEach(employee -> System.out.println(employee));

    }
}
