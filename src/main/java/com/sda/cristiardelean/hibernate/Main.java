package com.sda.cristiardelean.hibernate;

import com.sda.cristiardelean.hibernate.model.Department;
import com.sda.cristiardelean.hibernate.repository.DepartmentRepository;
import com.sda.cristiardelean.hibernate.utils.SessionManager;

public class Main {

    public static void main(String[] args) {

        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department1 = new Department();
        department1.setName("HR");
        departmentRepository.save(department1);
        //departmentRepository.save("IT");

       Department department =  departmentRepository.findById(1);
        System.out.println(department);

        Department department2 = departmentRepository.findById(2);
        System.out.println(department2);

        department.setName("HRDepartment");
        departmentRepository.update(department);
       department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.delete(department);
        department = departmentRepository.findById(1);
        System.out.println(department);


    }

}
