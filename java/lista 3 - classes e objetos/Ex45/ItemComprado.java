package exercicio45;

public class ItemComprado {
	
	private int id;
	private Produto produto;
	private int quantidade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	ItemComprado() {
		
	}
	
	ItemComprado(int id, Produto produto, int quantidade) {
		
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		
	}

}
