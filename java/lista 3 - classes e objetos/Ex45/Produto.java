package exercicio45;

public class Produto {
	
	private int id;
	private double preco;
	private ItemComprado item; 
	
	// getters e setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ItemComprado getItemComprado() {
		return item;
	}
	public void setItemComprado(int item) {
		this.item = item;
	}
	
	Produto() {
		
	}
	
	Produto(int id, double preco, ItemComprado item) {
		
		this.id = id;
		this.preco = preco;
		this.item = item;
		
		
	}
	
	

}
