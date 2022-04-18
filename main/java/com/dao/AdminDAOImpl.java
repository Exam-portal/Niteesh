package com.dao;

import java.util.List;   

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.model.Admin;
import org.hibernate.Session;
import org.hibernate.*;
@Component
public class AdminDAOImpl implements AdminDAO {
   @Autowired
   SessionFactory sessionFactory;
	@Override
	public void addTest(Admin test) {
		
		 Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(test);
			session.flush();
			session.getTransaction().commit();
			session.close();

	}
	

	@Override
	public Admin findTest(int id) {
		Session session = sessionFactory.openSession();
        Admin test = session.find(Admin.class,id);
	return test;
	}

	@Override
	public List<Admin> findAllTest() {
		Session session =sessionFactory.openSession();
    	List<Admin> testlist= session.createQuery("select a from admin").list();
		return testlist;
	}

	@Override
	public boolean updateTest(Admin test) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(test);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteTest(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Admin test = session.find(Admin.class,id);
		session.delete(test);
		session.flush();       
		session.getTransaction().commit();
		session.close();
		return true;
	}

	
    @Override
public boolean createTest(int id) {
		
	    Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Admin test = session.find(Admin.class,id);
		session.update(test);
		session.flush();
		session.getTransaction().commit();
		session.close();  
	return true;		
	}

    
	@Override
	public String login(Admin test) {
		Session session=sessionFactory.openSession();
		Admin adminDetails=session.find(Admin.class, test.getId());
		if(adminDetails.getMail().equals(test.getMail())){
			return "Success";
		}
		return "Fail";
	}


	@Override
	public String changePassword(Admin admin) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Admin adminDetails=session.find(Admin.class,admin.getId());
		adminDetails.setPassword(admin.getPassword());
		session.update(adminDetails);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return "successfull";
	}
	
		
	

//	@Override
//	public String changePassword(Admin test) {
//		Session session=sessionFactory.openSession();
//		session.getTransaction().begin();
//		Admin adminDetails=session.find(Admin.class,test.getId());
//		adminDetails.setPassword(test.getPassword());
//		session.update(adminDetails);
//		session.flush();
//		session.getTransaction().commit();
//		session.close();
//		return "successfull";
//	}
}