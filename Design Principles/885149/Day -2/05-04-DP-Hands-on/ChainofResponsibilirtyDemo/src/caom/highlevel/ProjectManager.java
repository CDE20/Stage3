package caom.highlevel;
public class ProjectManager extends ILeaveRequestHandler {

	

	public ProjectManager(int days) {
		this.days=days;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approve(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"  Leave accepted by Project Manager");
		
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		System.out.println("rejected by Manager");
		
	}

}