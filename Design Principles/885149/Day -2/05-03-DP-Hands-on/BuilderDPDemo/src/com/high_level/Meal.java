package com.high_level;

import java.util.ArrayList;

public class Meal {
	
	ArrayList<Item> items =  new ArrayList<>();
	
	
	public void addItme(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost=0.0f;
		for(Item item:items) {
			cost=cost+item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
	      }	
	}

}
