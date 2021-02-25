
public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
				}
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
		}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEURO(double usd) { 
		return usd * 0.92; 
		}

}
