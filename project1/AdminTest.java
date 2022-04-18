package com.latest.project1.project1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.AdminService;
import com.model.Admin;
import junit.framework.Assert;
@SpringBootTest
class AdminTest {

	
	@Autowired
	AdminService service;
	
	@Test    
	void testAdd() {
		Admin test = new Admin();
		test.setAddress("old baker street");  
		test.setMail("abc@gmail.com");
		test.setName("Niteesh");
		service.add(test);
		
		Admin data_to_be_added=service.findTest(test.getId());
		Assert.assertEquals("Niteesh",data_to_be_added.getName());
		Assert.assertEquals("abc@gmail.com",data_to_be_added.getMail());
		}

	@Test
	void testFindTest() {
		
		Admin test = new Admin();
		test.setAddress("new baker street");
		test.setMail("xyz@gmail.com");
		test.setName("vikas");
		service.add(test);
		
		Admin data_to_be_added=service.findTest(test.getId());
		Assert.assertEquals("vikas",data_to_be_added.getName());
		Assert.assertEquals("xyz@gmail.com",data_to_be_added.getMail());
		
	}

	@Test
	void testFindAllTest() {
		
		Admin test = new Admin();
		test.setAddress("main street");
		test.setMail("mnd@gmail.com");
		test.setName("satish");
		service.add(test);
		
		Admin data_to_be_added=service.findTest(test.getId());
		Assert.assertEquals("satish",data_to_be_added.getName());
		Assert.assertEquals("mnd@gmail.com",data_to_be_added.getMail());
		
	}
    @Test
	void testUpdateTest() {
    	
		Admin test1 = new Admin();
		test1.setAddress("side street");
		test1.setMail("hij@gmail.com");
		test1.setName("venky");
		service.add(test1);
		test1.setName("nikky");
		service.updateTest(test1);
		Assert.assertEquals(true,service.updateTest(test1));
		   
	}
    @Test  
	void testDeleteTest() { 
    	
    	Admin admin=service.findTest(3);
    	service.deleteTest(3);
    	Admin admin2=service.findTest(3);
    	Assert.assertNull(admin2);
    
    }
    
	@Test
	void testChangePassword() {
		Admin admin = new Admin();
		admin.setId(1);
		admin.setPassword("1234");
		service.changePassword(admin);
	     Assert.assertEquals("1234",admin.getPassword());
        admin.setPassword("12345");
		service.changePassword(admin);
	  	}
	
	@Test 
	void testLogin() {
		
  		Admin admin = new Admin();
		admin.setId(1);
	 	admin.setLogin("12345");
	     Assert.assertEquals("12345",admin.getLogin());
	}
    
	
	@Test
	void testCreateTest() {
		
		
		
		Admin test1 = new Admin();
	    test1.setAddress("ghost street");
		test1.setMail("dfg@gmail.com");
		test1.setName("pinky");
		service.add(test1);
		test1.setName("husky");
		service.updateTest(test1);
		Assert.assertEquals(true,service.CreateTest(1));
		service.CreateTest(2);
		Admin  data_to_be_updated=service.findTest(test1.getId());
	}
}
    

