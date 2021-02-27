package observerPattern;

public class Admin2Observer implements INotificationObserver {
	
	String name="Admin2";
	@Override
	public void OnServerDown(int tickets) {
		// TODO Auto-generated method stub
		if(tickets>=10)
		System.out.println("Notification has been recerved by : "+name+" Total tickets "+tickets);
		else
		{
			System.out.println("less the 10 tickets");
		}
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
