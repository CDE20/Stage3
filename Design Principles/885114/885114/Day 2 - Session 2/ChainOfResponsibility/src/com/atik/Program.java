package com.atik;

import com.atik.leaverequesthandler.Supervisor;

public class Program {
	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("ABC");
		leaveRequest.setLeaveDays(6);
		
		ILeaveRequestHandler leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);

		System.out.println("----------------------");
		leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("XYZ");
		leaveRequest.setLeaveDays(30);
		
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		
		
	}
}
