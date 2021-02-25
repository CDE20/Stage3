
public class HR extends ILeaveRequestHandler{
	public HR(int days)
	{
		this.days=days;
	}

	@Override
	public void approve(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" Leave accepted by HR");
		
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		System.out.println("rejected by HR");
		
	}

}
