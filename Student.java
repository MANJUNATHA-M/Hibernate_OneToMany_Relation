package com.hibernate.onetomany.Hibernate_OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int SId;
	private String SName;
	private String SGrade;
	
	@OneToMany(mappedBy = "student")
	private List<Laptop> laptops=new ArrayList<Laptop>();

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getSGrade() {
		return SGrade;
	}

	public void setSGrade(String sGrade) {
		SGrade = sGrade;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [SId=" + SId + ", SName=" + SName + ", SGrade=" + SGrade + ", laptops=" + laptops + "]";
	}
	
	
	
}
