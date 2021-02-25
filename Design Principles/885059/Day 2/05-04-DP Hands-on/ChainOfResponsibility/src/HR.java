
public class HR implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;


	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {

		if (leaveRequest.getLeaveDays() >= 5) {
			System.out.println("Leave Request Approved by HR for " + leaveRequest.getEmployeeName() + " for "
					+ leaveRequest.getLeaveDays() + " Days.");
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}


	@Override
	public void setNext(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;		
	}

}
