package com.factory;

import com.model.CarType;
import com.model.Location;

public abstract class Car {
	
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

	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

	public abstract void construct();
	
	@Override
	public String toString() {
		return "CarModel- "+model+" located in "+location;
	}

}
