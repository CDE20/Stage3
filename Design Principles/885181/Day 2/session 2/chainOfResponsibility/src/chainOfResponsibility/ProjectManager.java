package chainOfResponsibility;

public class ProjectManager implements ILeaveRequestHandler  {
	ILeaveRequestHandler nextHandler;
	@Override
	public void handleRequest(LeaveRequest l) {
		// TODO Auto-generated method stub
		if(l.LeaveDays>3 && l.LeaveDays<=5)
		{
			System.out.println("Leave granted to "+ l.Employee +" By Manager");
		}
		else {
			ILeaveRequestHandler handler=new HR();
			handler.handleRequest(l);
		}
	}

}
