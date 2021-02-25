public class Supervisor extends ILeaveRequestHandler {
	
	public Supervisor(int days) {
		this.days = days;
	}

	@Override
	public void approve(String name) {
		System.out.println(name + "'s" + " Leave accepted by Supervisor");

	}

	@Override
	public void reject() {
		System.out.println("Leave rejected by supervisor");

	}

}