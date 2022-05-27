package exercicio43;


public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private Emprestimo emprestimo;
	
	
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
 	
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	Pessoa () {
	
	}
	
	Pessoa (int id, String nome, int idade, String email, Emprestimo emprestimo) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.emprestimo = emprestimo;
	}
	

}


