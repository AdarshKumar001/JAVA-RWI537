package com.todo.Springs;

public class Emp {
	
	private int id;
	private String name;
	private String desgn;
	private float Salary;
	public Emp(int id, String name, String desgn, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.desgn = desgn;
		Salary = salary;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", desgn=" + desgn + ", Salary=" + Salary + "]";
	}
	
	
	

}
