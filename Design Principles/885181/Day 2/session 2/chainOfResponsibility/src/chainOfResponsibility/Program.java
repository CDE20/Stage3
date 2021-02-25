package chainOfResponsibility;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveRequest leaveRequest=new LeaveRequest("priya",6);
		ILeaveRequestHandler handler=new Supervisor();
		handler.handleRequest(leaveRequest);
	}

}
