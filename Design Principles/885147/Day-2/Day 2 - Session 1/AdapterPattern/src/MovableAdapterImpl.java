public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable luxaryCars;

	public MovableAdapterImpl(Movable luxaryCars) {
		this.luxaryCars = luxaryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxaryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxaryCars.getPrice());
	}

	private double convertUSDtoEURO(double usd) {
		return usd * 0.7579;
	}

}