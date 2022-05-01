package encapsulamento;

public class Cliente {
	
	public int id;
	public String nome;
	public int idade;
	public String email;
	ContaBancaria conta;
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
		
	}
	
	Cliente() {
		
	}
	
	public void atualizarEmail() {
		
	}
	
	
}
