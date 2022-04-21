package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Admin1;
@Repository
public interface Admin1DAO {
	
public void addAdmin(Admin1 admin);
	
	public Admin1 findAdmin(int id);
	
	public List<Admin1> findAllAdmin();
	
	public boolean updateAdmin(Admin1 admin);
	    
	public boolean deleteAdmin(int id);
	
	public boolean createAdmin( int id);
	
	public String login(Admin1 admin);
	
    public void changePassword(Admin1 admin);
	

}
