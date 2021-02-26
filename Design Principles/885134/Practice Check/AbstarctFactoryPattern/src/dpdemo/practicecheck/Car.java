package dpdemo.practicecheck;

public abstract class Car {
	
	CarType model=null;
	Location location=null;

	Car(CarType model,Location location)
	{
		this.model=model;
		this.location=location;
	}
	
	abstract void construct();
	
	public CarType getModel()
	{
		return model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}
	
}
