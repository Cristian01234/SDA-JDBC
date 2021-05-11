package com.sda.cristiardelean.hibernate.utils;

import com.sda.cristiardelean.hibernate.model.Department;
import com.sda.cristiardelean.hibernate.model.Employee;
import com.sda.cristiardelean.hibernate.model.Project;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionManager extends AbstractSessionManager {

    private static final SessionManager INSTANCE = new SessionManager();


    private SessionManager() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory(){
       return INSTANCE.getSessionFactory("humanResources");
    }


    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Project.class);
    }


}
