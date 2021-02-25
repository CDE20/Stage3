package com.atik.leaverequesthandler;

import com.atik.ILeaveRequestHandler;
import com.atik.LeaveRequest;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.leaveDays <= 5) {
			System.out.println("Request Approved by Project Manager");
		}
		else {
			System.out.println("Forwarded to HR");
			nextHandler = new HR();
			nextHandler.handleRequest(leaveRequest);
		}
	}

}
