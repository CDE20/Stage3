
public class PhoneRepair implements IRepair {

	@Override
	public void processRepair(String modelName) {
		System.out.println(modelName + " :Phone Repair Order Accepted");
	}

}
