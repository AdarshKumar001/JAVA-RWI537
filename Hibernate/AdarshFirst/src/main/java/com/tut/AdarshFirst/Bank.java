package com.tut.AdarshFirst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankDetail")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String BankName;
	private String IFSC;
	
	private Employee employee;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int id, String bankName, String iFSC, Employee employee) {
		super();
		Id = id;
		BankName = bankName;
		IFSC = iFSC;
		this.employee = employee;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Banck [Id=" + Id + ", BankName=" + BankName + ", IFSC=" + IFSC + ", employee=" + employee + "]";
	}
	
	
	
	}
	
	
	

