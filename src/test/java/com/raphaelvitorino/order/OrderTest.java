package com.raphaelvitorino.order;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class OrderTest {
	@Test
	@DisplayName("Should return order total value")
	void shouldReturnOrderTotalValue() {
		Order order = buildOrder();
		Double amount = order.getOrderTotalValue();
		assertThat(amount).isEqualTo(1550.50);
	}

	@Test
	@DisplayName("Should return order item amount")
	void shouldReturnOrderItemAmount() {
		Order order = buildOrder();
		int itemsSize = order.getOrderItemAmount();
		assertThat(itemsSize).isEqualTo(2);
	}

	@Test
	@DisplayName("Should finish order with items")
	void shouldFinishOrderWithItems() throws Exception {
		Order order = buildOrder();
		order.finishOrder();
		assertThat(order.getStatus()).isEqualTo(OrderStatus.FINISHED);
	}

	@Test
	@DisplayName("Should not finish order without items")
	void shouldNotFinishOrderWithoutItems() {
		Order order = buildEmptyOrder();
		assertThatThrownBy(() -> {
			order.finishOrder();
		}).isInstanceOf(Exception.class)
			.hasMessage("Order cannot be empty");
	}

	@Test
	@DisplayName("Should return true when order is empty")
	void shouldReturnTrueWhenOrderIsEmpty() {
		Order order = buildEmptyOrder();
		boolean isOrderEmpty = order.isOrderEmpty();
		assertThat(isOrderEmpty).isTrue();
	}

	@Test
	@DisplayName("Should return false when order is not empty")
	void shouldReturnFlaseWhenOrderIsNotEmpty() {
		Order order = buildOrder();
		boolean isOrderEmpty = order.isOrderEmpty();
		assertThat(isOrderEmpty).isFalse();
	}

	private Order buildOrder() {
		List<Item> items = new ArrayList<>();
		Item keyboard = new Item("Teclado Corsair K95", "RGB", 1100.00);
		Item mouse = new Item("Mouse Razer", "Viper 20000 DPI", 450.50);
		items.add(keyboard);
		items.add(mouse);
		return new Order("João", items);
	}

	private Order buildEmptyOrder() {
		List<Item> items = new ArrayList<>();
		return new Order("João", items);
	}
}

