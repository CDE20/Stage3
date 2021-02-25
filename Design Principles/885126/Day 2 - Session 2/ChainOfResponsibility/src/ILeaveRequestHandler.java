public abstract class ILeaveRequestHandler {
	 public static int SUPERVISORDAYS=3;
	 public static int PROJECTMANAGER=5;
	 public static int HRDAYS=7;
	 protected ILeaveRequestHandler nextHandler;
	 protected int days;
	 public void setNextHandler(ILeaveRequestHandler nextHandler) {
			this.nextHandler = nextHandler;
		}
	 
	 public void HandleRequest(int days, String name) {
		 //System.out.println("in");
		if(this.days>=days) {
			approve(name);
		}
		else
		{
			reject();
		}
		if(nextHandler!=null) {
			nextHandler.HandleRequest(days,name);
		}



}
	 abstract public void approve(String name);
	 abstract public void reject();
	
}