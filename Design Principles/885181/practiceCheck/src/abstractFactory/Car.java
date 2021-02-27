package abstractFactory;

public abstract class Car {
  // private CarType model=null;
   //private Location location=null;

Car(CarType model,Location location)
   {
	   this.model=model;
	   this.location=location;
   }

 abstract void contruct();
 
 CarType model=null;
 Location location=null;
 public CarType getModel() {
	return model;
 }

  public void setModel(CarType model) {
	this.model = model;
  }

  public Location getLocation() {
	return location;
  }

  public void setLocation(Location location) {
	this.location = location;
  }

@Override
public String toString() {
	return "Car [model=" + model + ", location=" + location + "]";
}
 
 
}
