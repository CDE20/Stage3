public class Program {

	private static ILeaveRequestHandler getChaining() {
		ILeaveRequestHandler supervisor = new Supervisor(ILeaveRequestHandler.SUPERVISORDAYS);

		ILeaveRequestHandler projectManager = new ProjectManager(ILeaveRequestHandler.PROJECTMANAGER);
		ILeaveRequestHandler hr = new HR(ILeaveRequestHandler.HRDAYS);

		supervisor.setNextHandler(projectManager);
		projectManager.setNextHandler(hr);
		return supervisor;

	}

	public static void main(String args[]) {
		ILeaveRequestHandler handler = getChaining();
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setName("Aniruddh");
		leaveRequest.setDays(6);
		handler.HandleRequest(leaveRequest.getDays(), leaveRequest.getName());

	}

}