package exercicio45;

public class Pedido {
	
	private int id;
	private Cliente cliente;
	private ItemComprado itemComprado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemComprado getItemComprado() {
		return itemComprado;
	}
	public void setItemComprado(ItemComprado itemComprado) {
		this.itemComprado = itemComprado;
	}
	
	Pedido() {
		
	}
	
	Pedido(int id, Cliente cliente, ItemComprado itemComprado) {
		
		this.id = id;
		this.cliente = cliente;
		this.itemComprado = itemComprado;
		
	}

}
