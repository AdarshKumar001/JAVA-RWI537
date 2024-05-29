package HibernateState;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentss {
	
	@Id
	private int studentId;
	private String Name;
	private String CityName;
	private String Certificate;
	public Studentss(int studentId, String name, String cityName, String certificate) {
		super();
		this.studentId = studentId;
		Name = name;
		CityName = cityName;
		Certificate = certificate;
	}
	public Studentss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getCertificate() {
		return Certificate;
	}
	public void setCertificate(String certificate) {
		Certificate = certificate;
	}
	@Override
	public String toString() {
		return "Studentss [studentId=" + studentId + ", Name=" + Name + ", CityName=" + CityName + ", Certificate="
				+ Certificate + "]";
	}

}
