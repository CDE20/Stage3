package com.high_level;

import com.low_level.BugattiVeyron;
import com.low_level.MovableAdapterImpl;

public class AdapterDesignDemo {
	
	public static void main(String[] args) {
		Movable move = new BugattiVeyron();
		MovableAdapter adapter = new MovableAdapterImpl(move);
		System.out.println(adapter.getSpeed()+" KmPh");
		System.out.println(adapter.getPrice()+" Euro");
	}

}
