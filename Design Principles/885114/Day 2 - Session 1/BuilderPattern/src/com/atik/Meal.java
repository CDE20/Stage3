package com.atik;

import java.util.ArrayList;
import java.util.List;

import com.atik.interfaces.Item;

public class Meal {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}

		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing " + item.packing());
			System.out.println(", Price  " + item.price());
		}
	}

}
