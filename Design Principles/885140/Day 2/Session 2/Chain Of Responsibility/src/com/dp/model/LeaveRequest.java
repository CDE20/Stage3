package com.dp.model;

public class LeaveRequest {

	private String employeeName;
	private int noOfDays;
	
	public LeaveRequest(String name, int days) {
		this.employeeName = name;
		this.noOfDays = days;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getNoOfDays() {
		return noOfDays;
	}

}
