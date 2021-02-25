
public class Supervisor implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler=new ProjectManager();
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int ld=leaveRequest.getLeaveDays();
		if(ld>0 && ld<3)
		{
			System.out.println("Leave Approved  by Supervisor for :: "+leaveRequest.getEmployeeName());
		}
		else if(ld>=3)
			nextHandler.HandleRequest(leaveRequest);
			
	}

}
