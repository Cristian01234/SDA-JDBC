package com.sda.cristiardelean.hibernate.repository;

import com.sda.cristiardelean.hibernate.model.Department;
import com.sda.cristiardelean.hibernate.model.Employee;
import com.sda.cristiardelean.hibernate.model.Project;
import com.sda.cristiardelean.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectRepository {
    //todo to be implemented in a similar way like in department repository



    public void delete(Project project){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(project);
        transaction.commit();
        session.close();
    }


    public void update(Project project){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(project);
        transaction.commit();
        session.close();
    }

    public void save(Project project)
    {
        Session session= SessionManager.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(project);
        transaction.commit();
        session.close();
    }
}
