package SingleResponsiblity;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("order accepted"+ modelName);
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+ modelName);
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+ accessoryType);
	}
	
	

}
