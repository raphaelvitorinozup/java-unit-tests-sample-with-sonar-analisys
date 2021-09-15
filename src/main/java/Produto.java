public class Produto {
	private String nome;
	private String descricao;
	private Double valor;

	public Produto(String nome, String descricao, Double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

}

