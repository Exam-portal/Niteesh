package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Admin1;
@Component
public class Admin1DAOImpl implements Admin1DAO{
  @Autowired
  SessionFactory sessionFactory;
	@Override
	public void addAdmin(Admin1 admin) {
		
		 Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(admin);
			session.flush();
			session.getTransaction().commit();
			session.close();

	}

	@Override
	public Admin1 findAdmin(int id) {
		
		Session session = sessionFactory.openSession();
        Admin1 admin = session.find(Admin1.class,id);
	return admin;
	}

	@Override
	public List<Admin1> findAllAdmin() {
		
		Session session =sessionFactory.openSession();
    	List<Admin1> adminlist= session.createQuery("select a from admin").list();
		return adminlist;
	}

	@Override
	public boolean updateAdmin(Admin1 admin) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteAdmin(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Admin1 admin = session.find(Admin1.class,id);
		session.delete(admin);
		session.flush();       
		session.getTransaction().commit();
		session.close();
		return true;
	}

		
	@Override
	public boolean createAdmin(int id) {
		 Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			Admin1 admin= session.find(Admin1.class,id);
			session.update(admin);
			session.flush();
			session.getTransaction().commit();
			session.close();  
		return true;		
	}

	@Override
	public String login(Admin1 admin) {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("select a from Admin a where a.id = :adminId and a.password = :password");
		Admin1 adminDetails=session.find(Admin1.class, admin.getId());
		if(adminDetails.getPassword().equals(admin.getPassword())) {
			return "Success";
		}
		return "Fail";
	}

	@Override
	public void changePassword(Admin1 admin) {
		
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Admin1 adminDetails=session.find(Admin1.class, admin.getId());
	adminDetails.setPassword(admin.getPassword());
		session.update(adminDetails);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	

}
