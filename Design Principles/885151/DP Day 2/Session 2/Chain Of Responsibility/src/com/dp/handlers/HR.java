package com.dp.handlers;

import com.dp.ILeaveRequestHandler;
import com.dp.model.LeaveRequest;

public class HR implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
	@Override
	public void HandleRequest(LeaveRequest request) {
	
		if(request.getNoOfDays()>=5) {
			System.out.println("Your Leave Request is Accepted By HR");
		}
		else
			System.out.println("Your Leave Request is Rejected By HR");

	}

}
