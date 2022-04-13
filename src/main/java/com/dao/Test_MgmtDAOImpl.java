package com.dao;

import java.util.List;         
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Test_Mgmt;

import org.hibernate.Session;
import org.hibernate.*;
@Component
public class Test_MgmtDAOImpl implements Test_MgmtDAO {
	    
     @Autowired
     SessionFactory sessionFactory;
	public void addTest(Test_Mgmt test) {
    	 Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(test);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
     
	public Test_Mgmt findTest(int id) {
		
		Session session=sessionFactory.openSession();
	    Test_Mgmt test=session.find(Test_Mgmt.class, id);
		return test;
	}

	public List<Test_Mgmt> findAllTest() {
		Session session=sessionFactory.openSession();
		List<Test_Mgmt> testlist=session.createQuery("select t from Test t").list();
		return testlist;

	}
    public boolean updateTest(Test_Mgmt test) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(test);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
		
	}

	public boolean deleteTest(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(id);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
		
	}





	
}
