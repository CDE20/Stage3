public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars; 
	
	

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEuro(double price) {
		return price*0.82;
	}
}