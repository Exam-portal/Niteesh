package com.dao;

import java.util.List;

import com.model.Admin;

public interface AdminDAO {
	
	
	
	public void addTest(Admin test);
	
	public Admin findTest(int id);
	
	public List<Admin> findAllTest();
	
	public boolean updateTest(Admin test);
	    
	public boolean deleteTest(int id);
	
	public boolean createTest( int id);
	
	public String login (Admin admin);
	
    public String changePassword(Admin admin);
     

}
