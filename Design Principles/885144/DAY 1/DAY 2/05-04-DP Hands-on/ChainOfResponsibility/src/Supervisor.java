
public class Supervisor implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;

	@Override
	public void setNext(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() < 3) {
			System.out.println("Leave Request Approved by Supervisor for " + leaveRequest.getEmployeeName() + " for "
					+ leaveRequest.getLeaveDays() + " Days.");
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
