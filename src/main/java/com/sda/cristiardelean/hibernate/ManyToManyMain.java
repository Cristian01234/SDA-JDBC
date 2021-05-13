package com.sda.cristiardelean.hibernate;

import com.sda.cristiardelean.hibernate.model.Employee;
import com.sda.cristiardelean.hibernate.model.Project;
import com.sda.cristiardelean.hibernate.repository.EmployeeRepository;
import com.sda.cristiardelean.hibernate.repository.ProjectRepository;
import com.sda.cristiardelean.hibernate.utils.SessionManager;

import java.sql.Date;

public class ManyToManyMain {
    public static void main(String[] args) {

        ProjectRepository projectRepository = new ProjectRepository();


        Project project1 = new Project();
        project1.setName("ProjectX");
        projectRepository.save(project1);


        Project project2 = new Project();
        project2.setName("ProjectX");
        projectRepository.save(project2);

        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employee1 = new Employee();
        employee1.setFirstName("Mircea");
        employee1.setLastName("Popa");
        employee1.setEmail("jgfuf@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744128986");
        employee1.setSalary(5000);
        employee1.getProjects().add(project1);
        employee1.getProjects().add(project1);
        employeeRepository.save(employee1);


        Employee employee2 = new Employee();
        employee2.setFirstName("Vasile");
        employee2.setLastName("Vasilescu");
        employee2.setEmail("jgfuf@yahoo.com");
        employee2.setDateOfBirth(Date.valueOf("1950-02-03"));
        employee2.setPhoneNumber("0744654548");
        employee2.setSalary(12000);
        employee2.getProjects().add(project1);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Ioan");
        employee3.setLastName("Popa");
        employee3.setEmail("jg3uf@yahoo.com");
        employee3.setDateOfBirth(Date.valueOf("1937-04-03"));
        employee3.setPhoneNumber("0744168986");
        employee3.setSalary(5050);
        employee3.getProjects().add(project1);
        employee3.getProjects().add(project1);
        employeeRepository.save(employee3);







        SessionManager.shutDown();

    }


}
