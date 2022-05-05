package exercicio36;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
	
	// getters e setters 
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	Produto() {
		
	}
	
	Produto(int id, String nome, double preco, double quantidade, Categoria categoria) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		
	}
	
	// metodos
	
	public String exibirNomeEpreco(String nome, double preco) {
		return "Nome: %s \n Preco: %d";
				
	}
	
	
	public String exibirNomeEquantidade(String nome, double quantidade) {
		return "Nome: %s \n Quantidade: %d";
	}

}
