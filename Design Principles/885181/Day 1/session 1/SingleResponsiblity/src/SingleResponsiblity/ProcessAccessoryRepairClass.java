package SingleResponsiblity;

public class ProcessAccessoryRepairClass implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println("repair accepted"+ accessoryType);
	}

}
