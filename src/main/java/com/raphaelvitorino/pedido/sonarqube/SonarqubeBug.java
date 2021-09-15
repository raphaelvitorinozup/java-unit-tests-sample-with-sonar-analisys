package com.raphaelvitorino.pedido.sonarqube;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SonarqubeBug {
	public String toString() {
		List<String> lista = new ArrayList<>();
		if (lista.isEmpty()) {
			return null; // Noncompliant
		} else {
			return "string";
		}
	}

	public BigDecimal getBigDecimal() {
		double valor = 1.1;
		BigDecimal decimal = new BigDecimal(valor); // Noncompliant;
		return decimal;
	}
}
