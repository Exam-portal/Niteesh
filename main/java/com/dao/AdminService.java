package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Admin;
@Service
public class AdminService {
	
	@Autowired
	AdminDAO AdminDAOImpl;
	

	public void add(Admin test) {
		
		AdminDAOImpl.addTest(test);
	}
	
	public Admin findTest(int id) {
		
		return AdminDAOImpl.findTest(id);
	}
	
	public List<Admin> findAllTest(){
		
		return AdminDAOImpl.findAllTest();
	}
	
	public boolean updateTest(Admin test) {
		
		return AdminDAOImpl.updateTest(test);
	}
	    
	public boolean deleteTest(int id) {
		
		return AdminDAOImpl.deleteTest(id);
		
	}
	
	public boolean CreateTest(int id) {
		 return  AdminDAOImpl.createTest(id);
	}
	
	public String login(Admin test) {
		return AdminDAOImpl.login(test);
	}
	
	public String changePassword(Admin test) {
		return AdminDAOImpl.changePassword(test);
	}

}
