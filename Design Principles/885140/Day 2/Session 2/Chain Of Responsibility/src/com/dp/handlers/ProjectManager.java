package com.dp.handlers;

import com.dp.ILeaveRequestHandler;
import com.dp.model.LeaveRequest;

public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
	@Override
	public void HandleRequest(LeaveRequest request) {

		if(request.getNoOfDays()>=3 && request.getNoOfDays()<5) {
			System.out.println("Your Leave Request is Accepted By Project Manager");
		}
		else if(request.getNoOfDays()>=5) {
			System.out.println("Forwarding Your request to HR");
			nextHandler = new HR();
			nextHandler.HandleRequest(request);
		}

	}

}
