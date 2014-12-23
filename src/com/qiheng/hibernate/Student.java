package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

public class Student {
	
	private String id;
	
	private String student_name;
	
	private String address;
	
	private Date timestamp;
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	
	
	
}
