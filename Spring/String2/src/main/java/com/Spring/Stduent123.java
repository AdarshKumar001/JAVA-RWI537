package com.Spring;

public class Stduent123 {
	private int StudentId;
	private String StudentNAme;
	private String Certificate;
	public Stduent123(int studentId, String studentNAme, String certificate) {
		super();
		StudentId = studentId;
		StudentNAme = studentNAme;
		Certificate = certificate;
	}
	public Stduent123() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentNAme() {
		return StudentNAme;
	}
	public void setStudentNAme(String studentNAme) {
		StudentNAme = studentNAme;
	}
	public String getCertificate() {
		return Certificate;
	}
	public void setCertificate(String certificate) {
		Certificate = certificate;
	}
	@Override
	public String toString() {
		return "Stduent123 [StudentId=" + StudentId + ", StudentNAme=" + StudentNAme + ", Certificate=" + Certificate
				+ "]";
	}
	
	

}
