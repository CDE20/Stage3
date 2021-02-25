public class Main 
{

	public static ILeaveRequestHandler doChaining() {
		ILeaveRequestHandler supervisor=new Supervisor(ILeaveRequestHandler.SUPERVISORDAYS);
		
		ILeaveRequestHandler projectManager = new ProjectManager(ILeaveRequestHandler.PROJECTMANAGER);
		supervisor.nextHandler=projectManager;
		
		ILeaveRequestHandler hr=new HR(ILeaveRequestHandler.HRDAYS);
		projectManager.nextHandler=hr;
		
		return supervisor;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ILeaveRequestHandler handler= doChaining();
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setName("Harivivek");
		leaveRequest.setDays(12);
		handler.HandleRequest(leaveRequest.getDays(),leaveRequest.getName());
	}

}