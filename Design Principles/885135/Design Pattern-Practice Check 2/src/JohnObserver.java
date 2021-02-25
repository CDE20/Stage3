
public class JohnObserver implements INotificationObserver{

	private String name="John";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println("Server Down message received by "+name);
	}
}
