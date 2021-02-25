package com.model;

import com.interfaces.Movable;
import com.interfaces.MovableAdapter;

public class AdapterDemo {

	public static void main(String[] args) {
		Movable move = new BugattiVeyron();
		MovableAdapter adapter = new MovableAdapterImpl(move);
		System.out.println(adapter.getSpeed()+" KmPh");
		System.out.println(adapter.getPrice()+" Euro");
	}

}
