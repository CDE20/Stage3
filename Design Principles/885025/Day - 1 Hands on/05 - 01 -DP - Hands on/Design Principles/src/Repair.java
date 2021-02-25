
public class Repair implements IAccessoryRepair, IPhoneRepair{

	@Override
	public void processPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("Repair accepted "+ modelName);
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println("Repair Accepted "+accessoryType);
	}

}
