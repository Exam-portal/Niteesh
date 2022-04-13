package com.dao;

import java.util.List;
import com.model.Test_Mgmt;

public interface Test_MgmtDAO {
	
	public void addTest(Test_Mgmt test);
	
	public Test_Mgmt findTest(int id);
	
	public List<Test_Mgmt> findAllTest();
	
	public boolean updateTest(Test_Mgmt test);
	
	public boolean deleteTest(int id);
	
	   
	   

}
