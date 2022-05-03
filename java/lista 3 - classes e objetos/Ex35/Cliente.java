package encapsulamento;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private Conta conta;
	
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	// constructors
	
	Cliente(int id, String nome, int idade, String email, Conta conta) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	
	}
	
	Cliente() {
		
	}
	
	// metodos
	
	public void atualizarEmail(String email) {
		this.email = email;
	}
	
	public String exibirNomeEidade(String nome, int idade) {
		return "Nome: %s \n Idade: %d";
	}
	
	public String exibirDadosConta(String agencia, String numero, double saldo) {
		return "Agencia: %s \n Conta: %s \n Saldo: R$ %d";
	}
	

}
