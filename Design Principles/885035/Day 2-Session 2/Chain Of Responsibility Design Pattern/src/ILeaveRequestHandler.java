
public abstract class ILeaveRequestHandler {

	 public static int SUPERVISORDAYS=3;
	 public static int PROJECTMANAGER=5;
	 public static int HRDAYS=20;
	 protected ILeaveRequestHandler nextHandler;
	 protected int days;
	 
	 public void HandleRequest(int days, String name) {
		 //System.out.println("in");
		if(this.days>=days) {
			System.out.println(name+"'s leaves accepted by "+this.getClass().getName());
			return;
		}
		if(nextHandler!=null) {
			nextHandler.HandleRequest(days,name);
		}
	 }
}
