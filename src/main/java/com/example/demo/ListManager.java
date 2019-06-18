package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
	
	private List<String> items;
	
	public ListManager() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(String item) {
		this.items.add(item);
	}
	
	public void removeItem(String item) {
		// do nothing
	}
	
	public List<String> getItems(){
		return this.items;
	}
	
	
}
