package com.latest.Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.Test_MgmtService;
import com.model.Test_Mgmt;

import junit.framework.Assert;
@SpringBootTest
class Test_MgmtTest {
	
	@Autowired
	Test_MgmtService service;

	
	@Test   
	void testAdd() {   
		
		Test_Mgmt test = new Test_Mgmt();
		test.setCourseType("java");
		service.add(test);
		     
		Test_Mgmt test_to_be_added=service.findTest(test.getTest_Id());
		Assert.assertEquals("java",  test_to_be_added.getCourseType());
	}

	@Test
	void testFindTest() {
		
		Test_Mgmt test = new Test_Mgmt();
		test.setCourseType("python");
		service.add(test);
		
		Test_Mgmt test_to_be_find=service.findTest(test.getTest_Id());
		Assert.assertEquals("python",  test_to_be_find.getCourseType());
		
	}

	@Test
	void testFindAllTest() {
		
		Test_Mgmt test = new Test_Mgmt();
		test.setCourseType("devops");
		service.add(test);
		
		Test_Mgmt test_to_be_findAllTest=service.findTest(test.getTest_Id());
		Assert.assertEquals("devops",  test_to_be_findAllTest.getCourseType());
		
	}

	@Test
	void testUpdateTest() {
		
		Test_Mgmt test1 = new Test_Mgmt();
		test1.setCourseType("core java");
		service.add(test1);
		test1.setCourseType("oops");
		service.updateTest(test1);
		Assert.assertEquals(true,service.updateTest(test1));
		   
	}   

	@Test
	void testDeleteTest() {
		
		
		
		Test_Mgmt test_to_be_deleted=service.findTest(3);
		service.deleteTest(3);
		Assert.assertNotNull(test_to_be_deleted);
}
	


}
