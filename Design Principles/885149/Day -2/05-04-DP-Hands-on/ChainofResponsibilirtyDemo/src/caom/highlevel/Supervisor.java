package caom.highlevel;
public class Supervisor extends ILeaveRequestHandler {
	public Supervisor(int days)
	{
		this.days=days;
	}

	@Override
	public void approve(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" Leave accepted by Supervisor");
		
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		System.out.println("rejected by supervisor");
		
	}

}