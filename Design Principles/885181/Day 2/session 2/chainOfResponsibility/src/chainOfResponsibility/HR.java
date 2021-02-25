package chainOfResponsibility;

public class HR implements ILeaveRequestHandler {
  
	ILeaveRequestHandler nextHandler;
	 @Override
	public void handleRequest(LeaveRequest l) {
		// TODO Auto-generated method stub
		if(l.LeaveDays>5)
		{
			System.out.println("Leave granted to "+l.Employee+" by HR");
			
		}
	}

}
