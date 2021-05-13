package com.sda.cristiardelean.hibernate.repository;

import com.sda.cristiardelean.hibernate.model.Department;
import com.sda.cristiardelean.hibernate.model.Employee;
import com.sda.cristiardelean.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeRepository {
    public Employee findById(Integer id)
    {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id
        Employee employee = session.find(Employee.class, id);
        session.close();
        return employee;
    }
    public void save(Employee employee)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
    }

    public void delete(Employee employee){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
        session.close();
    }


    public void update(Employee employee){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }
    public List<Employee> findAllEmployeesFromDepartment(String department){
        Session session = SessionManager.getSessionFactory().openSession();
        String hqlquery = "from Employee e where e.department.name = :departmentName";
        Query<Employee>employeeQuery = session.createQuery(hqlquery);
        employeeQuery.setParameter("departmentName", department);
        List<Employee>employees = employeeQuery.list();
        session.close();
        return employees;

    }
}
