package com.raphaelvitorino.order;

public class Item {
	private String name;
	private String description;
	private Double price;

	public Item(String name, String description, Double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}
}

