
public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;

	@Override
	public void setNext(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() < 5) {
			System.out.println("Leave Request Approved by Project Manager for " + leaveRequest.getEmployeeName() + " for "
					+ leaveRequest.getLeaveDays() + " Days.");
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
