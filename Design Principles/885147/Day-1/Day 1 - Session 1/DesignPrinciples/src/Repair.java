public class Repair implements IAccessoryRepair, IPhoneRepair {

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println("Repair accepted : " + modelName);
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Repair Accepted : " + accessoryType);
	}

}