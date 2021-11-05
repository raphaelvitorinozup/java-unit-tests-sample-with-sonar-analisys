package com.raphaelvitorino.order;

import java.util.List;

public class Order {
	private String customer;
	private List<Item> items;
	private OrderStatus status;

	public Order(String customer, List<Item> items) {
		this.customer = customer;
		this.items = items;
		this.status = OrderStatus.OPENED;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Double getOrderTotalValue() {
		Double orderTotalValue = 0.00;
		for (Item item : items) {
			orderTotalValue += item.getPrice();
		}
		return orderTotalValue;
	}

	public int getOrderItemAmount() {
		return this.items.size();
	}

	public void finishOrder() throws Exception {
		if (!items.isEmpty()) {
			this.status = OrderStatus.FINISHED;
		} else {
			throw new Exception("Order cannot be empty");
		}
	}

	public boolean isOrderEmpty() {
		if (getOrderItemAmount() >= 1) {
			return false;
		} else {
			return true;
		}
	}

}

