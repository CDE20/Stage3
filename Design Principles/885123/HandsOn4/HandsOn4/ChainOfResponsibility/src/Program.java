
public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployeeName("Purusham");
		leaveRequest.setLeaveDays(10);
		ILeaveRequestHandler supervisor=new Supervisor();
		supervisor.HandleRequest(leaveRequest);

	}

}
