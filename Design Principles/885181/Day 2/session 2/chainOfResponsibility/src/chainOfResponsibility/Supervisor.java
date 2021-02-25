package chainOfResponsibility;

public class Supervisor implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler;

	@Override
	public void handleRequest(LeaveRequest l) {
		// TODO Auto-generated method stub
		//LeaveRequest l1=l;
		if(l.LeaveDays<=3)
		{
			System.out.println("Leave granted to "+l.Employee+" by supervisor");
		}
		else
		{
			ILeaveRequestHandler handler=new ProjectManager();
			handler.handleRequest(l);
		}
		
		
	}
}
