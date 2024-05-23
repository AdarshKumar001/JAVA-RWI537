package com.tut.AdarshFirst;

import javax.persistence.Embeddable;

@Embeddable
public class Employee {

	private String EmployeName;
	private String job_title;
	private String Salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeName, String job_title, String salary) {
		super();
		EmployeName = employeName;
		this.job_title = job_title;
		Salary = salary;
	}
	public String getEmployeName() {
		return EmployeName;
	}
	public void setEmployeName1(String employeName) {
		EmployeName = employeName;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeName=" + EmployeName + ", job_title=" + job_title + ", Salary=" + Salary + "]";
	}
	public void setEmployeName(String employeName2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmployeName11(String employeName2) {
		// TODO Auto-generated method stub
		
	}
  
	
}
