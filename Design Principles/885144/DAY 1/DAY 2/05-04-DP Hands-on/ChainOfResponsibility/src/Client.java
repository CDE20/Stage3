
public class Client {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Shubham Kumar");
		leaveRequest.setLeaveDays(10);

		ILeaveRequestHandler supervisorHandler = new Supervisor();
		ILeaveRequestHandler projectManagerHandler = new ProjectManager();
		ILeaveRequestHandler hrHandler = new HR();

		supervisorHandler.setNext(projectManagerHandler);
		projectManagerHandler.setNext(hrHandler);

		supervisorHandler.HandleRequest(leaveRequest);

	}
}
