package caom.highlevel;
public class Main {
	private static ILeaveRequestHandler getChaining()
	{
        ILeaveRequestHandler supervisor=new Supervisor(ILeaveRequestHandler.superviserCount);
		
		ILeaveRequestHandler projectManager = new ProjectManager(ILeaveRequestHandler.managerCount);
		ILeaveRequestHandler hr=new HR(ILeaveRequestHandler.hrcount);
		
		supervisor.setNextHandler(projectManager);
		projectManager.setNextHandler(hr);
		return supervisor;


		
	}
	
	public static void main(String args[])
	{
		ILeaveRequestHandler handler= getChaining();
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setName("Vaishnavi");
		leaveRequest.setDays(8);
		handler.handleRequest(leaveRequest.getDays(),leaveRequest.getName());

	}

}