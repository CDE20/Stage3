public class Client {

	public static void main(String[] args) {
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		double speed = bugattiVeyronAdapter.getSpeed();
		double price = bugattiVeyronAdapter.getPrice();
		System.out.println("Speed in KMPH : "+speed);
		System.out.println("Price in EURO : "+price);

	}

}