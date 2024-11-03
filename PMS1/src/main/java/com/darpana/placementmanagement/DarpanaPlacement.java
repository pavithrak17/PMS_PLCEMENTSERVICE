package com.darpana.placementmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DarpanaPlacement {
	
	@Id
	private Integer id;
	private String name;
	private String date;
	private String qualification;
	private Integer year;
	
	//getters & setters

	
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	public DarpanaPlacement() {
		super();
	}

	public DarpanaPlacement(int id, String name, String
			date, String qualification, int year) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}

	//to String added
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}

}
