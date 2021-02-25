
public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler=new HR();
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int ld=leaveRequest.getLeaveDays();
		if(ld<5)
			System.out.println("Leave Approved for :: "+leaveRequest.getEmployeeName());
		else
			nextHandler.HandleRequest(leaveRequest);
	}

}
