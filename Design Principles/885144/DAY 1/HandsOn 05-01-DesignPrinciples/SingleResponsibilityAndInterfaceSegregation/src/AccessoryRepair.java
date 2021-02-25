
public class AccessoryRepair implements IRepair {

	@Override
	public void processRepair(String accessoryType) {
		System.out.println(accessoryType + " :Accessory Repair Order Accepted");
	}

}
