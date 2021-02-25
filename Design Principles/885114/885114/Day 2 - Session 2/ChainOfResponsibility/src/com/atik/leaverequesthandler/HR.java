package com.atik.leaverequesthandler;

import com.atik.ILeaveRequestHandler;
import com.atik.LeaveRequest;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.leaveDays <= 10) {
			System.out.println("Request Approved by HR");
		}
		else {
			System.out.println("Rejected by HR");
		}
	}

}
