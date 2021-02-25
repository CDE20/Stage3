package com.dp.main;

import com.dp.ILeaveRequestHandler;
import com.dp.handlers.Supervisor;
import com.dp.model.LeaveRequest;

public class Main {

	public static void main(String[] args) {

		
		LeaveRequest request = new LeaveRequest("Nakul", 5);
		ILeaveRequestHandler handler = new Supervisor();
		handler.HandleRequest(request);
	}

}
