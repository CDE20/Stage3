package chainOfResponsibility;

public interface ILeaveRequestHandler {
   public static final ILeaveRequestHandler nextHandler = null;
   public void handleRequest(LeaveRequest l);
   
}
