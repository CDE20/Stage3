package AbstracrFactory;

public abstract class Car {

	CarType model = null;
	Location location = null;

	abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car model=" + model + ", location=" + location + "";
	}

}
