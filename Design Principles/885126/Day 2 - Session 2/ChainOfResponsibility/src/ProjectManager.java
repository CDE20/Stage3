
public class ProjectManager extends ILeaveRequestHandler {

	public ProjectManager(int days) {
		this.days=days;
	}

	@Override
	public void approve(String name) {
		System.out.println(name+"  Leave accepted by Project Manager");
		
	}

	@Override
	public void reject() {
		System.out.println("rejected by Manager");
		
	}

}