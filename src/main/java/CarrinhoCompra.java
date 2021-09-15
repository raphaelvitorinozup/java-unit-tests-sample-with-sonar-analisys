import java.util.List;

public class CarrinhoCompra {
	private String cliente;
	private List<Produto> produtos;

	public CarrinhoCompra(String cliente, List<Produto> produtos) {
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Double getValorTotalCompra() {
		Double valorTotal = 0.00;
		for (Produto produto : produtos) {
			valorTotal += produto.getValor();
		}
		return valorTotal;
	}

	public int getTotalItensCompra() {
		return this.produtos.size();
	}
}

