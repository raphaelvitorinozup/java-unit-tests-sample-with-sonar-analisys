import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompraTest {
	@Test
	@DisplayName("Deve retornar o valor total da compra")
	public void deveRetornarValorTotalCompra() {
		CarrinhoCompra carrinhoCompra = gerarCarrinhoCompra();
		Double valorTotal = carrinhoCompra.getValorTotalCompra();
		Assertions.assertEquals(valorTotal, 1550.50);
	}

	@Test
	@DisplayName("Deve retornar a quantidade de itens do carrinho")
	public void deveRetornarQuantidadeItensCarrinho() {
		CarrinhoCompra carrinhoCompra = gerarCarrinhoCompra();
		int quantidade = carrinhoCompra.getTotalItensCompra();
		Assertions.assertEquals(quantidade, 2);
	}

	private CarrinhoCompra gerarCarrinhoCompra() {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto teclado = new Produto("Teclado Corsair K95", "RGB", 1100.00);
		Produto mouse = new Produto("Mouse Razer", "Viper 20000 DPI", 450.50);
		produtos.add(teclado);
		produtos.add(mouse);
		CarrinhoCompra carrinhoCompra = new CarrinhoCompra("João", produtos);
		return carrinhoCompra;
	}
}

