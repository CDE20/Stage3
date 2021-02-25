package com.dp.handlers;

import com.dp.ILeaveRequestHandler;
import com.dp.model.LeaveRequest;

public class Supervisor implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
	@Override
	public void HandleRequest(LeaveRequest request) {

		if(request.getNoOfDays()>=1 && request.getNoOfDays()<3) {
			System.out.println("Your Leave Request is Accepted By Supervisor");
		}
		else if(request.getNoOfDays()>3) {
			System.out.println("Forwarding Your request to Project Manager");
			nextHandler = new ProjectManager();
			nextHandler.HandleRequest(request);
		}else
			System.out.println("Your Leave Request is Rejected By Supervisor");

	}

}
