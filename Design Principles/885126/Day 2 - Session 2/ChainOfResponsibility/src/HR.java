public class HR extends ILeaveRequestHandler{
	public HR(int days)
	{
		this.days=days;
	}

	@Override
	public void approve(String name) {
		System.out.println(name+" Leave accepted by HR");
		
	}

	@Override
	public void reject() {
		System.out.println("rejected by HR");
		
	}

}