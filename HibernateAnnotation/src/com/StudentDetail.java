package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StudentDetail {

	@Id
	int studId;
	String studName;
	String studAddr;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddr() {
		return studAddr;
	}
	public void setStudAddr(String studAddr) {
		this.studAddr = studAddr;
	}
	
	
}
