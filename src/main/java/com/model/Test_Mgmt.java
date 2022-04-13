package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Test_Mgmt {
	
	@Id
	@GeneratedValue
	private int Test_Id;
	
	
	@NotNull(message="Course Type cannot be null")
	@Column(name="courseName")
	private String CourseType;
	
	
	
	public void Start_Test() {}
	public void End_Test() {}
	public void View_Result() {}
	
  
	 public void Test_Mgmt() {}
	 
	 

	public int getTest_Id() {
		return Test_Id;
	}

	public void setTest_Id(int test_Id) {
		Test_Id = test_Id;
	}
	public String getCourseType() {
		return CourseType;
	}
	public void setCourseType(String courseType) {
		CourseType = courseType;
	}
	
}
