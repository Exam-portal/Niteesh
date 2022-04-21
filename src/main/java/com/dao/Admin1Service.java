package com.dao;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Admin1;
@Service
public class Admin1Service {
	
	@Autowired
	 Admin1DAO AdminDAOImpl ;
	
    public void add(Admin1 admin) {
		
		AdminDAOImpl.addAdmin(admin);
	}
	
	public Admin1 findAdmin(int id) {
		
		return AdminDAOImpl.findAdmin(id);
	}
	
	public List<Admin1> findAllAdmin(){
		
		return AdminDAOImpl.findAllAdmin();
	}
	
	public boolean updateAdmin(Admin1 admin) {
		
		return AdminDAOImpl.updateAdmin(admin);
	}
	    
	public boolean deleteAdmin(int id) {
		
		return AdminDAOImpl.deleteAdmin(id);
		
	}
	
	public boolean CreateAdmin(int id) {
		 return  AdminDAOImpl.createAdmin(id);
	}
	public String login(Admin1 admin) {
		
		return AdminDAOImpl.login(admin);
	}
	
	public void changePassword(Admin1 admin) {
		 AdminDAOImpl.changePassword(admin);
	}
	

}
