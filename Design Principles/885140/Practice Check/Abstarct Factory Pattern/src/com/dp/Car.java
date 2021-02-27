package com.dp;

public abstract class Car {

		private CarType model = null;
		private Location location = null;
		
		public abstract void construct();
		
		public Car(CarType model, Location location) {
			this.model = model;
			this.location = location;
		}
		
		
		CarType getModel() {
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

		
		

