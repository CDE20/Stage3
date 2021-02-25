package caom.highlevel;

public abstract class ILeaveRequestHandler {
	
	static int superviserCount=3;
	static int managerCount=5;
	static int hrcount=7;
	int days;
	protected ILeaveRequestHandler nextHandler;
	
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}
	
	public void handleRequest(int days,String name) {
		if(this.days<=days) {
			approve(name);
		}
		if(nextHandler!=null) {
			nextHandler.handleRequest(days, name);
		}
	}
	
	public abstract void approve(String name);
	
	
	public abstract void reject();
	

}
