package com.pillartechnology.checkoutorderkata;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Inventory {

	SortedSet<Item> items = Collections.synchronizedSortedSet(new TreeSet<Item>(Comparator.comparing(Item::getName)));
	
	// Getters & Setters
	

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	public SortedSet<Item> getItems() {
		return items;
	}
	
	
	// Methods
	
	public void addItem(Item item) {
		items.add(item);
	}





} // End Inventory()