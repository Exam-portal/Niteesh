package com.latest.Project;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.dao.Admin1Service;
import com.model.Admin1;
import junit.framework.Assert;

@SpringBootTest
class Admin1Test {
	
	@Autowired
	Admin1Service adminservice;
	
	@Test
	void testAdd() {
		
		Admin1 admin=new Admin1();
		admin.setId(1);
		admin.setName("niteesh");
		admin.setMail("ABC@gmail.com");
		admin.setAddress("ABC street");
        Assert.assertEquals("niteesh",admin.getName());	
        Assert.assertEquals("ABC@gmail.com",admin.getMail());
        Assert.assertEquals("ABC street", admin.getAddress());
		
		
	}

	@Test
	void testFindAdmin() {
		
		Admin1 admin=new Admin1();
        admin.setId(2);
		admin.setName("Dharma");
		admin.setMail("XYZ@gmail.com");
		admin.setAddress("XYZ street");
        Assert.assertEquals("Dharma",admin.getName());	
        Assert.assertEquals("XYZ@gmail.com",admin.getMail() );
        Assert.assertEquals("XYZ street", admin.getAddress());
        
		
	}

	@Test
	void testFindAllAdmin() {
		
		Admin1 admin=new Admin1();
        admin.setId(3);
		admin.setName("vikas");
		admin.setMail("ggg@gmail.com");
		admin.setAddress("ggg street");
        Assert.assertEquals("vikas",admin.getName());	
        Assert.assertEquals("ggg@gmail.com",admin.getMail() );
        Assert.assertEquals("ggg street", admin.getAddress());
		
	}

	@Test
	void testUpdateAdmin() {

		Admin1 admin=new Admin1();
        admin.setId(4);
		admin.setName("nikky");
		admin.setMail("nnn@gmail.com");
		admin.setAddress("nnn street");
        Assert.assertEquals("nikky",admin.getName());	
        Assert.assertEquals("nnn@gmail.com",admin.getMail() );
        Assert.assertEquals("nnn street", admin.getAddress());
		
		
	}

	@Test
	void testDeleteAdmin() {
		
		Admin1 admin=new Admin1();
        admin.setId(4);
		admin.setName("nikky");
		admin.setMail("nnn@gmail.com");
		admin.setAddress("nnn street");
        Assert.assertEquals("nikky",admin.getName());	
        Assert.assertEquals("nnn@gmail.com",admin.getMail() );
        Assert.assertEquals("nnn street", admin.getAddress());
	}

	  @Test
	  void testCreateAdmin() {
		
		Admin1 admin=new Admin1();
        admin.setId(4);
		admin.setName("nikky");
		admin.setMail("nnn@gmail.com");
		admin.setAddress("nnn street");
        Assert.assertEquals("nnn@gmail.com",admin.getMail() );
        Assert.assertEquals("nnn street", admin.getAddress());
	}
}