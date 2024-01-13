package com.hibernate.onetomany.Hibernate_OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private int Lid;
	private int LAmount;
	private String LName;
	private String LExpireddate;
	
	@OneToOne
	private Student student;

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public int getLAmount() {
		return LAmount;
	}

	public void setLAmount(int lAmount) {
		LAmount = lAmount;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getLExpireddate() {
		return LExpireddate;
	}

	public void setLExpireddate(String lExpireddate) {
		LExpireddate = lExpireddate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", LAmount=" + LAmount + ", LName=" + LName + ", LExpireddate=" + LExpireddate
				+ ", student=" + student + "]";
	}
	
	
}
