package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Test_Mgmt;

@Service
public class Test_MgmtService {
	
	@Autowired
	Test_MgmtDAO test_MgmtDAOImpl;
	
	public void add(Test_Mgmt test) {
		
		test_MgmtDAOImpl.addTest(test);
	}
	
	public Test_Mgmt findTest(int id) {
		
		return  test_MgmtDAOImpl.findTest(id);
	}
	
	public List<Test_Mgmt> findAllTest(){
		
		return test_MgmtDAOImpl.findAllTest();
		
	}
	
	public boolean updateTest(Test_Mgmt test) {
		
		return test_MgmtDAOImpl.updateTest(test);
	}
	
	public boolean deleteTest(int id) {
		
		return test_MgmtDAOImpl.deleteTest(id);
	}





	
	

}
